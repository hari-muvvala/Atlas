package day7;

public class Task010 {
    public static void main(String[] args) {
        // day7.Task010: Find greatest of 3 numbers using if-else if

        int num1 = 55;
        int num2 = 40;
        int num3 = 45;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest");
        } else {
            System.out.println("num3 is greatest");
        }
    }
}
