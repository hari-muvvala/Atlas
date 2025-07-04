package trainertasks.day14;

import java.util.Stack;

public class Task6_StackSearch {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Hari");
        names.push("Ravi");
        names.push("Divya");
        names.push("Anil");

        System.out.println("Stack: " + names);

        int position = names.search("Divya");

//        int position = names.search("Gopal");
        System.out.println(position);

        if (position == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position (from top): " + position);
        }
    }
}