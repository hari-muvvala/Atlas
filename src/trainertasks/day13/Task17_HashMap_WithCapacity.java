package trainertasks.day13;

import java.util.HashMap;

public class Task17_HashMap_WithCapacity {
    public static void main(String[] args) {
        // Create a HashMap with initial capacity 10
        HashMap<String, String> map = new HashMap<>(10);

        // Add some key-value pairs
        map.put("name", "Hari");
        map.put("location", "Khammam");
        map.put("role", "Developer");

        // Print the map
        System.out.println("HashMap contents:");
        System.out.println(map);
    }
}