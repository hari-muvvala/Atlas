package selflearning.stage1javabasics.oop;

public class OverloadDemo {
    String name;
    int age;

    // Default constructor
    public OverloadDemo() {
        name = "Guest";
        age = 0;
        System.out.println("Default constructor called.");
    }

    // Constructor with 1 parameter
    public OverloadDemo(String name) {
        this.name = name;
        age = 18;
        System.out.println("Constructor with 1 parameter called.");
    }

    // Constructor with 2 parameters
    public OverloadDemo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with 2 parameters called.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}