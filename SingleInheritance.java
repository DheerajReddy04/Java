class Parent {
    //int x = 10;
    void abc() {
        System.out.println("Parent class");
    }
}
public class SingleInheritance extends Parent{
    public static void main(String[] args) {
        //Parent p1 = new Parent();
        //p1.abc();
        SingleInheritance s1 = new SingleInheritance();
        s1.cba();
        s1.abc();
    }
    void cba() {
        System.out.println("Child class");
    }
}