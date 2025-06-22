package trainertasks.day11;

import java.util.*;

public class Task15_SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Using map to square each number and collect into a new list
    List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .toList();

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squares: " + squares);

        // directly print squares without collecting
//        numbers.stream()
//                .map(num -> num * num)
//                .forEach(System.out::println);
//        System.out.println("Original Numbers: " + numbers);
    }
}