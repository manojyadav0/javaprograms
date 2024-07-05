package Stackk;
import java.util.*;
class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>(); 
        System.out.println(arr.capacity());
        for(int i =1; i<=10; i++){
        arr.push(i);   
      }
      System.out.println(arr);
      arr.push(9);
      arr.pop();
      System.out.println(arr.capacity());
    }
}
