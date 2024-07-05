package simple;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nmuber:");
        int n = sc.nextInt();
        System.out.println("After reverse number:");
        while(n>0){
            int lastdigit = n % 10;
            System.out.print(lastdigit +"");
            n = n / 10;
        }
        System.out.println();
        sc.close();
    }
    
}
