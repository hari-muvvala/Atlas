package selflearning.stage1javabasics.exceptions;

public class ThrowThrowsExample {

    // This method may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access Denied: You must be 18+.");
        } else {
            System.out.println("Access Granted: You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program ends normally.");
    }
}