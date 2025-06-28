package trainertasks.day13;

import java.util.LinkedList;

public class Task6_GetFirstLast_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();

        items.add("Apple");
        items.add(100);
        items.add(3.14f);
        items.add(true);

        Object first = items.getFirst();
        Object last = items.getLast();

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        System.out.println("All elements in the list:");
        for (Object item : items) {
            System.out.println(item);
        }
    }
}