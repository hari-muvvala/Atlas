package trainertasks.day18;

import java.util.Scanner;

public class Task3_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("It's a " + count + "-digit number");
    }
}