package star;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a W value:");
        int W = sc.nextInt();
        System.out.println("enter a L value:");
        int L = sc.nextInt();
        
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < W; j++) {
                if (i == 0 || i == L - 1 || j == 0 || j == W - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
