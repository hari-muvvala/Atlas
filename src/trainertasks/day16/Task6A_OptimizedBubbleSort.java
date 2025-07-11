package trainertasks.day16;

public class Task6A_OptimizedBubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};  // Already sorted

        for (int i = 0; i < array.length - 1; i++) {

            // flag to track if any swap occurred
            boolean swapped = false;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;  // Mark that a swap happened
                }
            }

            // If no swaps in this pass, array is already sorted
            if (!swapped) {
                break;
            }
        }

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}