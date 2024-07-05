package array;

import java.util.Scanner;

public class ArrMani{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<d;j++){
            int st=sc.nextInt();
            int en =sc.nextInt();
            int val=sc.nextInt();
            for(int i=st-1;i<en;i++){
                arr[i]+=val;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
    }

    
}
