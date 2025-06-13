import java.util.ArrayList;

public class Task010 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Hari");
        a1.add("Gopal");
        System.out.println("Original List: " + a1);

        a1.add(1, "Muvvala");
        System.out.println("After Adding element at index 1: " + a1);

        a1.remove(0);
        System.out.println("Element removed from index 0: " + a1);

        a1.remove("Hari");
        System.out.println("Element Hari removed: " + a1);

        a1.set(0, "HGM");
        System.out.println("List after updation of value: " + a1);

        System.out.println("Prnting elements one by one:");
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }
}
