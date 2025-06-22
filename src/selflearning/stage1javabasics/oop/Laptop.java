package selflearning.stage1javabasics.oop;

public class Laptop {
    String brand;
    int price;
    String processor;

    // Constructor 1 - No arguments
    public Laptop() {
        this("Dell");  // Calls Constructor 2
        System.out.println("Constructor 1: No-arg constructor");
    }

    // Constructor 2 - One argument
    public Laptop(String brand) {
        this(brand, 50000);  // Calls Constructor 3
        System.out.println("Constructor 2: One-arg constructor");
    }

    // Constructor 3 - Two arguments
    public Laptop(String brand, int price) {
        this(brand, price, "Intel i5");  // Calls Constructor 4
        System.out.println("Constructor 3: Two-arg constructor");
    }

    // Constructor 4 - Three arguments
    public Laptop(String brand, int price, String processor) {
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        System.out.println("Constructor 4: Three-arg constructor");
    }

    void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Processor: " + processor);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.displaySpecs();
    }
}