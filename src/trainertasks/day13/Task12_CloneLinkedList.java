package trainertasks.day13;

import java.util.LinkedList;

public class Task12_CloneLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> original = new LinkedList<>();
        original.add("Apple");
        original.add(100);
        original.add(3.14f);
        original.add(true);

        LinkedList<Object> cloned = (LinkedList<Object>) original.clone();

        System.out.println("Original List: " + original);
        System.out.println("Cloned List: " + cloned);

        original.remove(0);

        System.out.println("Original List: " + original);
        System.out.println("Cloned List: " + cloned);

    }
}