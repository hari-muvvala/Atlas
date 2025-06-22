package day7;

import java.util.Scanner;

public class Task012_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String loginid,pwd;

        do {
            System.out.println("You have logged in for " + count + " times");
            System.out.println("Enter login ID: ");
            loginid = sc.nextLine();
            System.out.println("Enter pwd: ");
            pwd = sc.nextLine();
            count++;
        } while (loginid.equals("hmuvvala") && pwd.equals("root@123"));

        System.out.println("Invalid credentials");
        sc.close();
    }
}
