package day7;

enum color{
    red, blue, green, yellow
}
enum weekdays{
    sunday, monday, tuesday
}
public class Task016 {
    public static void main(String[] args) {
        color c1 = color.yellow;
        System.out.println(c1);

        weekdays c2 = weekdays.tuesday;
        System.out.println(c2);
    }
}