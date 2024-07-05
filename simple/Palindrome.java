package simple;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("number: " + palindrome + " is a palindrome number");
        } else {
            System.out.println("number: " + palindrome + " is not a palindrome number");
        }
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome% 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return originalNumber == reverse;
    }
}
