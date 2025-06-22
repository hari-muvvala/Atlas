package selflearning.stage1javabasics.oop;

public class AnonymousExample {
    public static void main(String[] args) {

        // Anonymous Inner Class implementing selflearning.stage1javabasics.oop.Greeting
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };

        // Calling the method
        greet.sayHello();
    }
}