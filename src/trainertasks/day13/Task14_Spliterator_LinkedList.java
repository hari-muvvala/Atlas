package trainertasks.day13;

import java.util.LinkedList;
import java.util.Spliterator;

public class Task14_Spliterator_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Hari");
        names.add("Divya");
        names.add("Vedansh");

        // Get Spliterator object from the list
        Spliterator<String> splitIterator = names.spliterator();

        // Use forEachRemaining to print each element
        System.out.println("Splitting the list:");
        splitIterator.forEachRemaining(System.out::println);
    }
}