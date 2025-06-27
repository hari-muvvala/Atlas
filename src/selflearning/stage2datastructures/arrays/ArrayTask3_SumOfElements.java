package selflearning.stage2datastructures.arrays;

public class ArrayTask3_SumOfElements {
    public static void main(String[] args) {
        int[] num = {0, 10, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
//            sum = sum + num[i];
            sum+= num[i];
        }
        System.out.println(sum);
    }
}
