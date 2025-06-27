import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task16A_SynchronizedHashMap {
    public static void main(String[] args) {

        // Step 1: Create a normal HashMap
        Map<String, Integer> hm1 = new HashMap<>();
        hm1.put("Hari", 1);
        hm1.put(null, 2); // First null key
        hm1.put("Ravi", 3);

        System.out.println("After adding first null key:");
        for (String key : hm1.keySet()) {
            System.out.println(key + " → " + hm1.get(key));
        }

        // Step 2: Add another null key → overwrite
        hm1.put(null, 99); // This replaces previous null key's value

        System.out.println("\nAfter adding second null key (overwrite):");
        for (String key : hm1.keySet()) {
            System.out.println(key + " → " + hm1.get(key));
        }

        // Step 3: Make HashMap synchronized
        Map<String, Integer> syncMap = Collections.synchronizedMap(hm1);

        // Step 4: Safely iterate through synchronized map
        System.out.println("\nSynchronized Map:");
        synchronized (syncMap) {
            for (String key : syncMap.keySet()) {
                System.out.println(key + " → " + syncMap.get(key));
            }
        }
    }
}