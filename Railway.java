/*
import java.util.Scanner;
public class Railway {
    Scanner sc = new Scanner(System.in);
    String Departure() {
        System.out.println("Enter the Departure Station:  ");
        String station_name = sc.next();
        return station_name;
        }

    String Destination() {
        System.out.println("Enter the Destination:  ");
        String destination_name = sc.next();
        return destination_name;
        }
}

interface Train{
    int trno = 123;
    void bookTicket();
    int get_ticket();
    }

class Passenger extends Railway implements Train{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass_name = "Uday";
        int age = 19;
        Railway r1 = new Railway();
        String departure = r1.Departure();
        String destination_name = r1.Destination();
        void bookTicket() {
            System.out.println("Do you want to book ticket");
            String op = sc.next();
            if(op == "yes") {
                System.out.println("You will get book ticket soon...");
                get_ticket();
            }
            else {
                System.out.println("You will not get ticket :/");
            }
        }
    
        int get_ticket() {
            System.out.println("You got the ticket");
        }
    }
}
*/

import java.util.Scanner;

interface Train {
    int trno = 123;

    void bookTicket();

    void getTicket();
}

class Railway {
    Scanner sc = new Scanner(System.in);

    String Departure() {
        System.out.println("Enter the Departure Station: ");
        return sc.next();
    }

    String Destination() {
        System.out.println("Enter the Destination: ");
        return sc.next();
    }
}

class Passenger extends Railway implements Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passName = "Uday";
        int age = 19;
        Railway r1 = new Railway();
        String departure = r1.Departure();
        String destination = r1.Destination();

        Passenger passenger = new Passenger();
        passenger.bookTicket();
    }

    @Override
    public void bookTicket() {
        System.out.println("Do you want to book a ticket?");
        String op = sc.next();
        if (op.equals("yes")) {
            System.out.println("You will get a ticket soon...");
            getTicket();
        } else {
            System.out.println("You will not get a ticket :/");
        }
    }

    @Override
    public void getTicket() {
        System.out.println("You got the ticket");
    }
}
