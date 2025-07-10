public class Task14_DecimalToBinary {

    // Recursive function to convert decimal to binary
    public static void decimalToBinary(int num) {
        // Base case: when num becomes 0, stop
        if (num == 0) return;
        // Recursive case: divide by 2 and print remainder after the recursion
        decimalToBinary(num / 2);
        System.out.print(num % 2);
    }

    public static void main(String[] args) {
        int number = 13;
        System.out.print("Binary of " + number + " is: ");
        if (number == 0) {
            System.out.print(0);
        } else {
            decimalToBinary(number); // Call recursive function
        }
        System.out.println(); // For newline
    }
}