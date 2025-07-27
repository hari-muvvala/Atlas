package trainertasks.day21;

import java.util.ArrayList;
import java.util.List;

// Superclass
class Animal {
    void sound() {
        System.out.println("Sound of some animal");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow (sound of cat)");
    }
}

public class Task8_GenericsSubstitution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

        Animal animal = cat; // Valid substitution
        animal.sound();

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        // List<Animal> animalList = catList; // Invalid - compile time error
        // animalList.add(new Dog()); // Hypothetical issue if allowed

        // Correct approach: using wildcard
        List<? extends Animal> animalList = catList;
        Animal a = animalList.get(0); // Reading is allowed
        a.sound();

        // animalList.add(new Cat()); // Not allowed - can't add to upper bounded wildcard list
    }
}