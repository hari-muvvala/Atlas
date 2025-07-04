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
        System.out.println(position);
    }
}