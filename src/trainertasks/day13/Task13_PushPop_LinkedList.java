package trainertasks.day13;

import java.util.LinkedList;

public class Task13_PushPop_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();

        items.add("Banana");
        items.add("Mango");

        System.out.println("Original List:");
        System.out.println(items);

        // Use push to add at the beginning
        items.push("Apple"); // same as addFirst()
        System.out.println("\nAfter push('Apple'):");
        System.out.println(items);

        // Use pop to remove from the beginning
        Object popped = items.pop(); // same as removeFirst()
        System.out.println("\nElement popped: " + popped);
        System.out.println("List after pop:");
        System.out.println(items);

//        So, this follows Stack behavior (LIFO: Last In, First Out)
    }
}