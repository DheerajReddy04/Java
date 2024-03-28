import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        String str = "My name is Dheeraj, I am 19 years old.";
        StringTokenizer s1 = new StringTokenizer(str);
        while(s1.hasMoreTokens()) {
            System.out.println(s1.nextToken());
        }
        System.out.println("----------");
        StringTokenizer s2 = new StringTokenizer(str, ",");
        while(s2.hasMoreTokens()) {
            System.out.println(s2.nextToken());
        }
    }
}

