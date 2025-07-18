package trainertasks.day18;

import java.util.*;

public class Task8_GroupByUnitDigit {
    public static void main(String[] args) {
        // Sample input
        int[] numbers = {45, 65, 21, 100, 20, 55, 10, 121};

        // Create a Map to hold unit digit → List of numbers
        Map<Integer, List<Integer>> unitDigitGroups = new HashMap<>();

        // Group numbers by their unit digit
        for (int num : numbers) {
            int unitDigit = num % 10;

            // If this digit is not yet in the map, create a new list
            unitDigitGroups.putIfAbsent(unitDigit, new ArrayList<>());

            // Add the number to the corresponding list
            unitDigitGroups.get(unitDigit).add(num);
        }

        // Display grouped output
        for (Map.Entry<Integer, List<Integer>> entry : unitDigitGroups.entrySet()) {
            System.out.print("Array " + entry.getKey() + " has: ");
            for (int val : entry.getValue()) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}