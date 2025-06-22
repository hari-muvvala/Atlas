package selflearning.stage1javabasics.oop;

public class LocalInnerExample {

    void displayMessage(String name) {
        // Local Inner Class inside a method
        class Greeter {
            void greet() {
                System.out.println("Hello, " + name + "! Welcome to Local Inner Classes.");
            }
        }

        Greeter g = new Greeter(); // Creating object of inner class
        g.greet();                 // Calling inner class method
    }

    public static void main(String[] args) {
        LocalInnerExample example = new LocalInnerExample();
        example.displayMessage("Hari");
    }
}