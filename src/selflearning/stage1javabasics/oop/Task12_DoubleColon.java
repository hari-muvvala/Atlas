package selflearning.stage1javabasics.oop;

import java.util.stream.Stream;

public class Task12_DoubleColon {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of(
                "Hello", "My", "name", "is", "Hari", "Gopal", "Muvvala"
        );

        stream.forEach(System.out::println);
    }
}