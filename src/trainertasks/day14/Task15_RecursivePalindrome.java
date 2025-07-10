public class Task15_RecursivePalindrome {

    // Recursive function to check if a string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start crosses end, it's a palindrome
        if (start >= end) return true;
        // If characters don't match, not a palindrome
        if (str.charAt(start) != str.charAt(end)) return false;
        // Move inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("Is '" + input + "' a palindrome? " + result);
    }
}