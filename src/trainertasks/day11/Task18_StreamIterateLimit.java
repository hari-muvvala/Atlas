package trainertasks.day11;

import java.util.stream.Stream;

public class Task18_StreamIterateLimit {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream
                .iterate(1, n -> n + 1)
                .limit(20);

        numbers
                .limit(10)
                .forEach(System.out::println);
    }
}