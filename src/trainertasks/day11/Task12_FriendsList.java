package trainertasks.day11;

import java.util.*;

public class Task12_FriendsList {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();

        friends.add("Hemanth");
        friends.add("Divya");
        friends.add("Sai");
        friends.add("Vaibhav");
        friends.add("Ravi");

        System.out.println("My Friends:");
        friends.forEach(System.out::println);
    }
}