package day7;

import java.util.Scanner;

public class Task011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // day7.Task011: Check day7.weekdays using switch
        System.out.println("Enter a number (1 to 7): ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();

    }
}