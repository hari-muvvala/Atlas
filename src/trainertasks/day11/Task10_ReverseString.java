package trainertasks.day11;

public class Task10_ReverseString {
    public static void main(String[] args) {
        String original = "hari gopal";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}