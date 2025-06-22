package day7;

public class Task013 {
    public static void main(String[] args) {
        // day7.Task013: Print numbers 1 to 10, skipping 7 and 5

        for (int i = 10; i >= 1; i--){
            if (i == 7 || i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}