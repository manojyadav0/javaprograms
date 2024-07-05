package Stackk;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(6);
        stack.push(10);
        stack.push(15);
        stack.push(18);


        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Peek Element: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
  