package trainertasks.day11;

import java.util.*;

public class Task13_FriendFullNames {
    public static void main(String[] args) {
        List<String> fullNames = new ArrayList<>();

        fullNames.add("Hemanth Bommena");
        fullNames.add("Divya Bandi");
        fullNames.add("Sai Yellanki");
        fullNames.add("Vaibhav Raj");
        fullNames.add("Ravi Kopparapu");

        System.out.println("My Friends:");
        fullNames.forEach(System.out::println);
    }
}