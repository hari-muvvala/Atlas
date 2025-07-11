package trainertasks.day16;

public class Task14_MergeSort {

    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            // Divide the array into two halves
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);

            System.out.println("dividing list done, starting merge");
            for (int num : array) {
                System.out.print(num + " ");
            }
            // Merge the sorted halves
            merge(array, low, mid, high);
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        // Merge elements in sorted order
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[index++] = array[left++];
            } else {
                temp[index++] = array[right++];
            }
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[index++] = array[left++];
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[index++] = array[right++];
        }

        // Copy sorted elements back into original array
        for (int i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {38, 16, 27, 39, 12};

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}