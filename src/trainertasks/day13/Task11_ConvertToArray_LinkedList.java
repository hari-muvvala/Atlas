package trainertasks.day13;

import java.util.Arrays;
import java.util.LinkedList;

public class Task11_ConvertToArray_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> items = new LinkedList<>();

        items.add("Apple");
        items.add(100);
        items.add(3.14f);
        items.add(true);

//        Object[] array = items.toArray();

        System.out.println(items);
        System.out.println(items.toArray());
        System.out.println(Arrays.toString(items.toArray()));
    }
}