package array;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        int sum = sumArray(array, array.length);
        System.out.println("Sum of array elements is " + sum);
        
        sc.close();
    }

    public static int sumArray(int[] array, int n) {
        if (n <= 0) {
            return 0; 
        } else {
            return array[n - 1] + sumArray(array, n - 1);
        }
    }
}
