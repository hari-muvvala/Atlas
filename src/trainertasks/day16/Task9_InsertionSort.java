package trainertasks.day16;

public class Task9_InsertionSort {
    public static void main(String[] args) {
        int[] array = {40, 13, 20, 8};

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            // shofting elements to right side
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }


//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j;
//
//            for (j = i - 1; j >= 0 && array[j] > current; j--) {
//                array[j + 1] = array[j];
//            }
//
//            array[j + 1] = current;
//        }

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}