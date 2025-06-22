package day7;

public class Task005 {
    public static void main(String[] args){
        //day7.Task005: Call methods for 4

        System.out.println("day7.Main started");
        System.out.println();
        System.out.println("Sum of 2 numbers is: " + add());
        System.out.println("Diff of 2 numbers is: " + subtract());
        System.out.println("Product of 2 numbers is: " + multiply());
        System.out.println("Division of 2 numbers is: " + divide());

        System.out.println("day7.Main ended");
    }
    public static int add(){
        int a = 10, b = 5;
        return a + b;
    }
    public static int subtract(){
        int a = 10, b = 5;
        return a - b;
    }
    public static int multiply(){
        int a = 10, b = 5;
        return a * b;
    }
    public static int divide(){
        int a = 10, b = 5;
        return a / b;
    }
}