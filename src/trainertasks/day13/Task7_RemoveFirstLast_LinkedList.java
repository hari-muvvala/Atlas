package trainertasks.day13;

import java.util.LinkedList;

public class Task7_RemoveFirstLast_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();

        items.add("Apple");
        items.add(100);
        items.add(3.14f);
        items.add(true);

        items.removeFirst();
        items.removeLast();

        System.out.println("After removing first and last elements:");
        for (Object item : items) {
            System.out.println(item);
        }
    }
}