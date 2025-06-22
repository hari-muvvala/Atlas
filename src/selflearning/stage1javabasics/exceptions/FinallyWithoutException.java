package selflearning.stage1javabasics.exceptions;

public class FinallyWithoutException {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        try {
            System.out.println("Trying to divide...");
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed: Cleanup complete.");
        }

        System.out.println("Program ends here.");
    }
}