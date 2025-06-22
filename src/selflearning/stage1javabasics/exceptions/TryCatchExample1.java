package selflearning.stage1javabasics.exceptions;

public class TryCatchExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Starting division...");

        try {
            int result = a / b;  // Risky code
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }

//        int result = a / b;
//        System.out.println(result);
        System.out.println("Program continues after try-catch.");
    }
}