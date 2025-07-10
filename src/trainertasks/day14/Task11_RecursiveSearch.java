public class Task11_RecursiveSearch {

    // Recursive function to search for a target value in the array
    public static boolean search(int[] arr, int index, int target) {
        // Base case: if index exceeds array bounds, target not found
        if (index >= arr.length) return false;

        // If current element matches the target, return true
        if (arr[index] == target) return true;

        // Recursive call to check the rest of the array
        return search(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10}; // Sample array
        int key = 8; // Target value to search for

        boolean found = search(nums, 0, key); // Call the recursive function
        System.out.println("Is " + key + " found? " + found); // Print result
    }
}