package day7;

public class Task014 {
    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'i', 'o', 'u'};
        System.out.println(arr);

        String[] names = {"Meena", "Tina", "Leena", "Heena"};
        System.out.println(names[0]);
        names[1] = "Reena";
        System.out.println(names[1]);
        System.out.println(names.length);
        System.out.println(names[4]); //This will throw ArrayIndexOutofBoundsException (Intentional)
    }
}
