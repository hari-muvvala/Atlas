package trainertasks.day18;

import java.util.Arrays;

public class Task17_RadixSort {

    // Main Radix Sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);  // Find the maximum number to know number of digits

        // Apply counting sort to each digit, from least significant to most significant
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Helper to find the maximum value in the array
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Counting sort used by Radix Sort for a specific digit (exp = 1, 10, 100, ...)
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // output array
        int[] count = new int[10]; // count array for digits 0 to 9

        // Count occurrences of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Change count[i] so that it now contains actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (stable sort, loop from end)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array (Radix Sort): " + Arrays.toString(arr));
    }
}