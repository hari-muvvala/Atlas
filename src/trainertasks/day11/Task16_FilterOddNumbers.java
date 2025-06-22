package trainertasks.day11;

import java.util.*;
import java.util.stream.Collectors;

public class Task16_FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55);

        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Odd Numbers: " + oddNumbers);

        // Alternate: Print directly using forEach (commented)
        // numbers.stream()
        //        .filter(num -> num % 2 != 0)
        //        .forEach(System.out::println);
    }
}