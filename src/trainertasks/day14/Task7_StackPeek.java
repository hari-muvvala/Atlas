package trainertasks.day14;

import java.util.Stack;

public class Task7_StackPeek {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Hari");
        names.push("Ravi");
        names.push("Divya");
        names.push("Anil");

        System.out.println("Stack: " + names);

        String topName = names.peek();
        System.out.println("Top element (peek): " + topName);

//        String topName2 = names.peek();
//        System.out.println("Top element (peek): " + topName2);

        System.out.println("Stack: " + names);
    }
}