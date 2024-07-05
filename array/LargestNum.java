package array;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        int max = findMax(array, size);
        System.out.println("The largest number is: " + max);
        
        sc.close();
    }

    public static int findMax(int[] array, int n) {
        if (n == 1) {
            return array[0]; 
        }
        return Math.max(array[n - 1], findMax(array, n - 1));
    }
}







