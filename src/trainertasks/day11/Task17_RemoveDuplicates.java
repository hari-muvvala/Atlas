package trainertasks.day11;

import java.util.*;
import java.util.stream.Collectors;

public class Task17_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 40);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("List without Duplicates: " + uniqueNumbers);
    }
}