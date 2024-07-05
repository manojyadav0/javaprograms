package simple;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int digits = countDigit(n);
        System.out.println("Number of digits in n: " + digits);
        sc.close();
    }

    public static int countDigit(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }
}