package selflearning.stage2datastructures.arrays;

public class ArrayTask4_MaxMin {
    public static void main(String[] args) {
        int[] num = {9, 10, 1, 3, 4};
//        int sum = 0;
        int min = num[0];
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (i < min) {
                min = num[i];
            }
            if (i > max) {
                max = num[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }
}