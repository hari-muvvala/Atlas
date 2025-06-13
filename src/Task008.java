public class Task008 {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Access denied - must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}