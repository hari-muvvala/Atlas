package trainertasks.day14;

import java.util.*;
import java.util.stream.Collectors;

public class Task10A_StackDequeToList {

    public static void main(String[] args) {

        // Stack example
        Stack<String> stack = new Stack<>();
        stack.push("Hari");
        stack.push("Divya");
        stack.push("Junnu");

        // Convert stack to list and print using stream
        List<String> stackList = new ArrayList<>(stack);
        System.out.println("Stack elements (stream):");
        stackList.stream().forEach(System.out::println);

        System.out.println();

        // Deque example
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");

        // Convert deque to list and print using stream
        List<String> dequeList = new ArrayList<>(deque);
        System.out.println("Deque elements (stream):");
        dequeList.stream().forEach(System.out::println);
    }
}