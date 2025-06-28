package trainertasks.day13;

import java.util.LinkedList;
import java.util.Spliterator;

public class Task15_TryAdvance_Spliterator_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<>();
        people.add("Hari");
        people.add("Divya");
        people.add("Vedansh");
        people.add("Khammam");

        // Get spliterator and split it
        Spliterator<String> it1 = people.spliterator();
        Spliterator<String> it2 = it1.trySplit(); // this may split into half

        // First half
        System.out.println("Spliterator 1:");
        while (it1.tryAdvance(name -> System.out.println(name)));

        // Second half
        System.out.println("Spliterator 2:");
        while (it2 != null && it2.tryAdvance(name -> System.out.println(name)));
    }
}