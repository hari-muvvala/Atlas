import java.util.Hashtable;
import java.util.Map;

public class Task012_DS_HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Anitha", 101);
        ht.put("Kavitha", 102);
        ht.put("Meera", 103);

        // Using entrySet to print all key-value pairs
        for (Map.Entry<String, Integer> e : ht.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // Using get() method directly
        System.out.println("Value for 'Anitha' using get(): " + ht.get("Anitha"));
        System.out.println("Value for 'Kavitha' using get(): " + ht.get("Kavitha"));
        System.out.println("Value for 'Meera' using get(): " + ht.get("Meera"));

//        System.out.println(ht.get(101));
    }
}