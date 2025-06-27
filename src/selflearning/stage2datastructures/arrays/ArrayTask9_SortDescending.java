package selflearning.stage2datastructures.arrays;

public class ArrayTask9_SortDescending {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 33, 2};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in descending order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}