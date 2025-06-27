import java.util.HashMap;
import java.util.Map;

public class Task013_DS_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Anitha", 101);
        hm.put("Kavitha", 102);
        hm.put("Meera", 103);

        // Using entrySet to print all key-value pairs
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // Using get() method directly
        System.out.println("Value for 'Anitha' using get(): " + hm.get("Anitha"));
        System.out.println("Value for 'Kavitha' using get(): " + hm.get("Kavitha"));
        System.out.println("Value for 'Meera' using get(): " + hm.get("Meera"));
    }
}