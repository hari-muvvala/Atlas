package selflearning.stage1javabasics.exceptions;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try started.");

            // Outer risky code
            int[] numbers = {1, 2, 3};

            try {
                System.out.println("Inner try started.");
                System.out.println("Accessing 5th element: " + numbers[4]); // Risky
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in inner catch: Index out of bounds");
            }

            // Outer risky code continues
            int result = 10 / 0; // Will cause ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught in outer catch: Cannot divide by zero");
        }

        System.out.println("Program continues after nested try-catch.");
    }
}