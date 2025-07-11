package trainertasks.day16;

public class Task17_QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);   // Sort left half
            quickSort(array, pivotIndex + 1, high);  // Sort right half
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && array[i] <= pivot) {
                i++;
            }
            while (j >= low && array[j] > pivot) {
                j--;
            }

            if (i < j) {
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap pivot with array[j] to place it correctly
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        return j;  // Return pivot index
    }

    public static void main(String[] args) {
        int[] array = {38, 16, 27, 39, 12};

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}