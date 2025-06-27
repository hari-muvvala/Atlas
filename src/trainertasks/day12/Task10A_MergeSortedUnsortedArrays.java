import java.util.Arrays;

public class Task10A_MergeSortedUnsortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {66, 11, 75, 34}; // Unsorted
        int[] arr2 = {100, 5, 89, 1,23}; // Unsorted

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merge = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merge[k++] = arr1[i++];
        }

        while (j < n2) {
            merge[k++] = arr2[j++];
        }

        System.out.print("Merged and sorted array: ");
        for (int x = 0; x < merge.length; x++) {
            System.out.print(merge[x] + " ");
        }

//        System.out.print("Merged and sorted array: ");
//        for (int item: merge) {
//            System.out.print(item + " ");
//        }
    }
}