package day7;

public class Task020 {
    public static void main(String[] args) {
        char[] name = {'H', 'a', 'r', 'i'};
        System.out.println(name);

        int n = name.length;
        System.out.println("There are " + n + " letters in my name");

        // Display each character
        for (int i = 0; i < n; i++){
            System.out.println(name[i] + " ");
        }
    }
}