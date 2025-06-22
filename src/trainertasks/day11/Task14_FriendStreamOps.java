package trainertasks.day11;

import java.util.*;

public class Task14_FriendStreamOps {
    public static void main(String[] args) {
        List<String> fullNames = new ArrayList<>();
        fullNames.add("Hemanth Bommena");
        fullNames.add("Divya Bandi");
        fullNames.add("Sai Yellanki");
        fullNames.add("Vaibhav Raj");
        fullNames.add("Ravi Kopparapu");

        System.out.println("Friends whose names start with 'D':");

        fullNames.stream()
                .filter(name -> name.endsWith("i"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}