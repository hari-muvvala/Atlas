package selflearning.stage2datastructures.arrays;

public class ArrayTask6_LinearSearch {
    public static void main(String[] args) {
        int[] num = {9, 10, 1, 3, 4, 1, 2, 3};
        int find = 1;
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == find) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
//        System.out.println("even = " + even + " odd = " + odd);
    }
}