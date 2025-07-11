package trainertasks.day16;

public class Task6_BubbleSort {
    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13};

        for (int i = 0; i < array.length - 1; i++) { //passes
            for (int j = 0; j < array.length - i - 1; j++) { //iterations
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}