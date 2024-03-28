class Parent {
    //int x = 10;
    void abc() {
        System.out.println("Parent class");
    }
}

class Child extends Parent{                //functions are abc, xyz
    void xyz() {
        System.out.println("Child class");
    }
}

public class MultiLevelInheritance extends Child{      //functions are abc, xyz, cba
    public static void main(String[] args) {
        //Parent p1 = new Parent();
        //p1.abc();
        MultiLevelInheritance m1 = new MultiLevelInheritance();
        m1.xyz();
        m1.abc();
        m1.cba();
    }
    void cba() {
        System.out.println("Grandchild class");
    }
}