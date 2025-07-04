package trainertasks.day14;

import java.util.Stack;

public class Task8_PushPopAndCheckEmpty {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Hari");
        names.push("Ravi");
        names.push("Divya");
        names.push("Anil");

        System.out.println("Stack: " + names);
        System.out.println(names.isEmpty());

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }

        System.out.println("Stack: " + names);
        System.out.println(names.isEmpty());

    }
}