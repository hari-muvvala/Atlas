package trainertasks.day21;

import java.util.ArrayList;
import java.util.List;

// Base class
class Animal11 {
    void sound() {
        System.out.println("Animal sound");
    }
}

// Subclass
class Cat11 extends Animal11 {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Task11_LowerBoundedWildcard {

    // Method accepts List of Cat11 or any superclass (e.g., Animal11)
    static void addCat(List<? super Cat11> list) {
        list.add(new Cat11()); // safe to add Cat11 or its subclass
        System.out.println("Cat added to the list");
    }

    public static void main(String[] args) {
        List<Animal11> animals = new ArrayList<>();
        addCat(animals);

        for (Object obj : animals) {
            if (obj instanceof Animal11) {
                ((Animal11) obj).sound();
            }
        }
    }
}