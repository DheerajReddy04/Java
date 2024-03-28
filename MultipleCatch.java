public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int z = 10 / 0;
            String name = "Dheeraj";
            System.out.println(name.charAt(10));
            int x[] = new int[3];   // A a1 = new A("Dheeraj");
            System.out.println(x[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("It's an Arithmetic Exception");
            return;
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bound");
            return;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of bound");
            return;
        }
        System.out.println("Only the first catch that gets callled is executed and the other catch blocks are ignored even if there are errors in the try block");
    }
}
