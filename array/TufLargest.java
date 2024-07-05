package array;
import java.util.Scanner;

public class TufLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();
        }

     
        int largestElement = findLargestElement(arr);
        System.out.println("The largest element in the array is: " + largestElement);

        sc.close();
    }

    static int findLargestElement(int[] arr) {  
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}


