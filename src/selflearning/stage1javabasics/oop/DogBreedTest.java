package selflearning.stage1javabasics.oop;

class Creature {
    String type;

    Creature() {
        System.out.println("selflearning.stage1javabasics.oop.Creature constructor called");
        type = "Unknown selflearning.stage1javabasics.oop.Creature";
    }

    Creature(String type) {
        System.out.println("selflearning.stage1javabasics.oop.Creature parameterized constructor called");
        this.type = type;
    }

    void displayType() {
        System.out.println("selflearning.stage1javabasics.oop.Creature type: " + type);
    }
}

class DogBreed extends Creature {
    String breed;

    DogBreed(String type, String breed) {
        super(type); // calling parent class constructor
        this.breed = breed;
    }

    void displayDetails() {
        displayType(); // inherited method
        System.out.println("Breed: " + breed);
    }
}

public class DogBreedTest {
    public static void main(String[] args) {
        DogBreed d1 = new DogBreed("Mammal", "Labrador");
        d1.displayDetails();
    }
}