package trainertasks.day21;

import java.util.List;
import java.util.ArrayList;

// Superclass
class Animal10 {
    void sound() {
        System.out.println("Animal sound");
    }
}

// Subclass
class Cat10 extends Animal10 {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Task10_UpperBoundedWildcard {

    // Method accepts list of Animal10 or any subclass (like Cat10)
    static void animalSound(List<? extends Animal10> animalList) {
        for (Animal10 element : animalList) {
            element.sound();
        }
    }

    public static void main(String[] args) {
        List<Cat10> cats = new ArrayList<>();
        cats.add(new Cat10());
        cats.add(new Cat10());

        animalSound(cats); // works due to upper bounded wildcard
    }
}