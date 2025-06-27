import java.util.HashMap;

public class Task16_HashMapNullKey {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Hari", "Engineer");
        map.put(null, "Doctor"); // First null key
        map.put("Ravi", "Writer");

        System.out.println("After 1st null key:");
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        System.out.println("\nNow adding another null key...");

        map.put(null, "Scientist"); // Second null key added

        System.out.println("After 2nd null key:");
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}