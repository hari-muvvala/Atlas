package trainertasks.day14;

import java.util.Stack;

public class Task5_PredefinedStackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack);

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }
}