
package simple;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String reversed = reverse(str);
        System.out.println("Reversed string is " + reversed);
        sc.close();
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str; 
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}

