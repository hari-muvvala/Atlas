package trainertasks.day21;

import java.util.List;
import java.util.ArrayList;

// Superclass
class Animal9 {
    void sound() {
        System.out.println("Animal sound");
    }
}

// Subclass
class Cat9 extends Animal9 {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Task9_UnboundedWildcard {

    // Method using unbounded wildcard - can accept any type of list
    static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Cat9> cats = new ArrayList<>();
        cats.add(new Cat9());
        cats.add(new Cat9());

        printList(cats);  // prints object references of Cat9
    }
}