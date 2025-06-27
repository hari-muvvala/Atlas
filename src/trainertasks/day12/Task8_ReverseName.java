import java.util.Scanner;

public class Task8_ReverseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

         char[] letters = name.toCharArray();
         for (int i = letters.length - 1; i >= 0; i--) {
             System.out.print(letters[i]);
         }

//        for (int i = name.length() - 1; i >= 0; i--) {
//            System.out.print(name.charAt(i));
//        }

        scanner.close();
    }
}