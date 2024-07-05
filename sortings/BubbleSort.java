package sortings;

public class BubbleSort {
    public static void bubbleSort(int[] number) {
        int n = number.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] number = {4, 6, 7, 9, 1, 3}; 
        bubbleSort(number);
        System.out.println("Sorted array:");
        for (int num : number) {
            System.out.print(num + " "); 
        }
    }
}

