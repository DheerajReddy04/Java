import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class AttendanceStudent extends Student {
    int attendance;

    public AttendanceStudent(String name, int age, int attendance) {
        super(name, age);
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public boolean isAlertRequired() {
        return attendance < 75;  // Added semicolon here
    }
}

class MarksStudent extends Student {
    private int marks;

    public MarksStudent(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter attendance: ");
        int attendance = scanner.nextInt();

        AttendanceStudent as = new AttendanceStudent(name, age, attendance);

        System.out.println("Name: " + as.getName());
        System.out.println("Age: " + as.getAge());
        System.out.println("Attendance: " + as.getAttendance());

        if (as.isAlertRequired()) {
            System.out.println("Alert: Attendance is less than 75");
        }

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        MarksStudent ms = new MarksStudent(name, age, marks);
        System.out.println("Marks: " + ms.getMarks());
    }
}
