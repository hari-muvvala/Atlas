public class Task13_ReverseString {

    // Recursive function to reverse a string
    public static String reverse(String str) {
        // Base case: empty or single character string is its own reverse
        if (str == null || str.length() <= 1) return str;
        // Recursive case: reverse the substring and append first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";

        String reversed = reverse(input); // Call recursive function
        System.out.println("Reversed string: " + reversed);
    }
}