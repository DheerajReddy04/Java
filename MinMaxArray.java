import java.util.Scanner;
public class MinMaxArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[5];
        for(int i =0;i < x.length;i++) {
            x[i] = sc.nextInt();
        }
        int minx = x[0];
        int maxx = x[0];
        for(int i =0;i<x.length;i++) {
            if(x[i] < minx) {
                minx = x[i];
            }
            if(x[i] > maxx) {
                maxx = x[i];
            }
        }
        System.out.println("Minimum: " + minx + " Maximum: " + maxx);
    }
}