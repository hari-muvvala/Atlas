package selflearning.stage1javabasics.exceptions;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 0};
        String text = null;

        try {
            // This line may throw ArithmeticException (division by zero)
            int result = numbers[0] / numbers[1];
            System.out.println("Division result: " + result);

            // This line may throw NullPointerException
            System.out.println("Length of text: " + text.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot find length of null.");
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling multiple selflearning.stage1javabasics.exceptions.");
    }
}