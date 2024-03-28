class demo222 {
    void abc() {
        System.out.println("Method with no parameter");
    }
    void abc(int x) {
        System.out.println(x+5);
    }
     void abc(int x, int y) {
        System.out.println(x+y);
    }
}
public class MethodOL {
    public static void main(String[] args) {
        demo222 d1 = new demo222();
        demo222 d2 = new demo222();
        d1.abc(10,20);
        d1.abc();
        d2.abc();
    }
}