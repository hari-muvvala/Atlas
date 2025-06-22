package day7;

import java.util.Scanner;

public class Task012_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter login ID: ");
        String loginid = sc.nextLine();
        System.out.println("Enter pwd: ");
        String pwd = sc.nextLine();

        while (loginid.equals("hmuvvala") && pwd.equals("root@123")){
            count++;
            System.out.println("You have logged in for " + count + " times");
            System.out.println("Enter login ID: ");
            loginid = sc.nextLine();
            System.out.println("Enter pwd: ");
            pwd = sc.nextLine();
        }

        System.out.println("Invalid credentials");
        sc.close();
    }
}
