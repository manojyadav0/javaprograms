package simple;
import java.util.Scanner;
public class SwapWithoutTemp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of a:");
        int a = sc.nextInt();
        System.out.println("enter the element of b:");
        int b = sc.nextInt();
        System.out.println("before swapping:a="+ a +",b = "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:a="+ a +",b = "+ b);
    }
}
