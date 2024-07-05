package simple;
import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: "); 
        int age = sc.nextInt();
        sc.close();
        if (age >= 18) { 
            System.out.println("right to vote");
        } else {
            System.out.println("not eligible");
        }
    }
}
