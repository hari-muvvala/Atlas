public class Task12_CountDigits {

    // Recursive function to count number of digits in a number
    public static int countDigits(int num) {
        // Base case: if number is 0, there are no more digits
        if (num == 0) return 0;
        // Recursive case: strip one digit and add 1 to count
        return 1 + countDigits(num / 10);
    }

    public static void main(String[] args) {
        int number = 12345; // Sample number

        int digitCount = countDigits(number); // Call recursive function
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
}