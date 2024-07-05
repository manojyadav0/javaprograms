package simple;

import java.util.Scanner; 

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Fibonacci series up to " + num + ":");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close(); 
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
