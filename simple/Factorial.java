package simple;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
        sc.close(); 
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
}
