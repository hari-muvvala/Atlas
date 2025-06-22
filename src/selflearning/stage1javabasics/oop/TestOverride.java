package selflearning.stage1javabasics.oop;

class ParentCreature {
    void makeSound() {
        System.out.println("selflearning.stage1javabasics.oop.ParentCreature makes a sound");
    }
}

class LittleDog extends ParentCreature {
    @Override
    void makeSound() {
        System.out.println("selflearning.stage1javabasics.oop.LittleDog says Woof");
    }
}

class LittleCat extends ParentCreature {
    @Override
    void makeSound() {
        System.out.println("selflearning.stage1javabasics.oop.LittleCat says Meow");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        ParentCreature dog = new LittleDog();
        ParentCreature cat = new LittleCat();

        dog.makeSound(); // Output: selflearning.stage1javabasics.oop.LittleDog says Woof
        cat.makeSound(); // Output: selflearning.stage1javabasics.oop.LittleCat says Meow
    }
}