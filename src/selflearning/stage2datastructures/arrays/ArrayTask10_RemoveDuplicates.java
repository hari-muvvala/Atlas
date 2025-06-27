package selflearning.stage2datastructures.arrays;

public class ArrayTask10_RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40, 30};
        int n = numbers.length;

        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(unique[i]);
        }
    }
}