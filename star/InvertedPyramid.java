
package star;

import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element:");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                if (i == 0 || j == 0 || j == N - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}



