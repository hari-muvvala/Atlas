package day7;

import java.util.Scanner;

public class Task007 {
    public static void main(String[] args) {
        // day7.Task007: take input for ID and pwd and print masked output

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter login ID: ");
        String id = sc.nextLine();

        System.out.println("Enter password: ");
        String pwd = sc.nextLine();

        System.out.println("Hi,");
        System.out.println("Your login ID is " + id);
        System.out.println("And your pwd is **********");
    }
}
