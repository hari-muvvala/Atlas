package trainertasks.day18;

import java.util.Scanner;

public class Task2_DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int units = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100) % 10;
        int thousands = (num / 1000) % 10;
        int tenThousands = (num / 10000) % 10;

        System.out.println("Units digit is " + units);
        System.out.println("Tens digit is " + tens);
        System.out.println("Hundreds digit is " + hundreds);
        System.out.println("Thousands digit is " + thousands);
        System.out.println("Ten-thousands digit is " + tenThousands);
    }
}