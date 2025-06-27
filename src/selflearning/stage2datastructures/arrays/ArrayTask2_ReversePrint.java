package selflearning.stage2datastructures.arrays;

public class ArrayTask2_ReversePrint {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}