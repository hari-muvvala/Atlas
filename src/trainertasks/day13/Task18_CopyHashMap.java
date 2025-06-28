package trainertasks.day13;

import java.util.HashMap;

public class Task18_CopyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Math", 90);
        hm1.put("Science", 85);
        hm1.put("English", 92);

        HashMap<String, Integer> hm2 = new HashMap<>(hm1);

        System.out.println("Original HashMap (hm1): " + hm1);
        System.out.println("Copied HashMap (hm2): " + hm2);
    }
}