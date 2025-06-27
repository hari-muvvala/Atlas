//package selflearning.stage2datastructures.arrays;
//
//public class ArrayTask7_ElementFrequency {
//    public static void main(String[] args) {
//        int[] num = {9, 10, 1, 3, 0, 1, 2, 2};
//        int find = 2;
//        int count = 0;
//        boolean found = false;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] == find) {
//                found = true;
//                count += 1;
////                break;
//            }
//        }
//        if (found) {
//            System.out.println("Exists and count = " + count);
//        } else {
//            System.out.println("Not exists");
//        }
////        System.out.println("even = " + even + " odd = " + odd);
//    }
//}

package selflearning.stage2datastructures.arrays;

public class ArrayTask7_ElementFrequency {
    public static void main(String[] args) {
        int[] numbers = {20, 15, 20, 10, 25, 20, 30};
        int target = 5;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println(target + " appears " + count + " times in the array.");
    }
}