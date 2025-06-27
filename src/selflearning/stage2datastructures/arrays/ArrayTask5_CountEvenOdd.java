package selflearning.stage2datastructures.arrays;

public class ArrayTask5_CountEvenOdd {
    public static void main(String[] args) {
        int[] num = {9, 10, 1, 3, 4, 1, 2, 3};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("even = " + even + " odd = " + odd);
    }
}