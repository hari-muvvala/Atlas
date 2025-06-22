package day7;

public class Task015 {
    public static void main(String[] args) {
        // String is immutable (cannot be changed)
        String name = "Meher is a trainer";
        name = "Hello"; // Reassignment creates a string object
        System.out.println(name);

        // Variables are mutable (can be changed)
        // creating strings using diff methods

        String str1 = "Java Strings";
        String str2 = new String(str1);
        String str3 = new String("are easy to learn");

        char[] ch = {'S', 't', 'r', 'i', 'n', 'g'};
        String str4 = new String(ch);   // String from char array

        // Print all forms of strings
        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);
    }
}