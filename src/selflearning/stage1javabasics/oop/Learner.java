package selflearning.stage1javabasics.oop;

public class Learner {
    String name;
    int age;

    // Default constructor
    public Learner() {
        System.out.println("Default constructor called.");
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Learner (String learnerName,int learnerAge) {
        System.out.println("Parameterized constructor called.");
        name = learnerName;
        age = learnerAge;
    }

    public void displayInfo() {
            System.out.println("Name: " + name +" , Age = " + age);
        }
}
