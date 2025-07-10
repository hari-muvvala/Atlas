public class Task16_RecursiveCopyArray {

    // Recursive function to copy elements from source to destination array
    public static void copyArray(int[] source, int[] destination, int index) {
        // Base case: stop when end of array is reached
        if (index >= source.length) return;
        destination[index] = source[index];
        copyArray(source, destination, index + 1);
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copied = new int[original.length];

        copyArray(original, copied, 0); // Call recursive function

        // Print copied array
        System.out.print("Copied array: ");
        for (int num : copied) {
            System.out.print(num + " ");
        }
    }
}