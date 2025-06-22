package selflearning.stage1javabasics.exceptions;

public class FinallyBlockExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println("Trying to divide...");
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed: Cleaning up...");
        }

        System.out.println("Program ends here.");
    }
}