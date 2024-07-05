
package simple;
import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the element of a:");
        int a = sc.nextInt();
        
        System.out.println("Enter the element of b:");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
