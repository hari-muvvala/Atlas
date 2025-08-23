package trainertasks.day27.task1;

import java.util.Scanner;

public class Task01_SortingStrategyMain {
    public static void main(String[] args) {
        SortingStretagy ctx = new SortingStretagy();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String line = sc.nextLine().trim();
                if (line.equalsIgnoreCase("Done")) break;
                ctx.addItem(line);
            }
        }

        // Alpha sorting
        ctx.setStretegyForSorting(new AlphabeticalSort());
        System.out.println("Alpha sorting\n");
        ctx.performSort().forEach(System.out::println);
        System.out.println();

        // Lengthwise sorting
        ctx.setStretegyForSorting(new LengthwiseSort());
        System.out.println("Lethwise sorting\n");
        ctx.performSort().forEach(System.out::println);
    }
}