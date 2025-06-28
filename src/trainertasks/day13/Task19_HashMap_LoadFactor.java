package trainertasks.day13;

import java.util.HashMap;

public class Task19_HashMap_LoadFactor {
    public static void main(String[] args) {
        HashMap<String, Integer> hm4 = new HashMap<>(10, 0.75f);

        hm4.put("Apple", 3);
        hm4.put("Banana", 6);
        hm4.put("Cherry", 9);
        hm4.put("Dates", 2);
        hm4.put("Elderberry", 5);

        System.out.println("HashMap with load factor 0.75:");
        System.out.println(hm4);
    }
}