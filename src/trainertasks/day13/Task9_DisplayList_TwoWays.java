package trainertasks.day13;

import java.util.LinkedList;

public class Task9_DisplayList_TwoWays {
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();

        items.add("Apple");
        items.add(100);
        items.add(3.14f);
        items.add(true);

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        System.out.println();

        for (Object item : items) {
            System.out.println(item);
        }
    }
}