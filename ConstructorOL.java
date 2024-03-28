class demo111 {
    demo111() {
        System.out.println("No parameters");
    }
    demo111(int x){
        System.out.println(x+5);
    }   
}
public class ConstructorOL {
    public static void main(String[] args) {
        demo111 d1 = new demo111();
        demo111 d2 = new demo111(10);
        //d1.display()
    }
}