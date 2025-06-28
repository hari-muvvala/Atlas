package trainertasks.day13;

import java.util.LinkedList;

public class Task8_UpdateElement_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();

        items.add("Apple");
        items.add(100);
        items.add(3.14f);
        items.add(true);

//        items.removeFirst();
//        items.removeLast();

        items.set(1, "Updated Value");

        System.out.println("Updating element at index 1");
        for (Object item : items) {
            System.out.println(item);
        }
    }
}