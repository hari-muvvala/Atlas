package selflearning.stage2datastructures.hashmaps;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        System.out.println(map);

        map.put("Hari","Java");
        map.put("Divya","Biology");
        map.put("Ravi","Physics");

        System.out.println(map);

        System.out.println(map.get("Hari"));

        System.out.println(map.containsKey("Ravi"));

        System.out.println("removing Ravi key" + map.remove("Ravi"));

        System.out.println(map);

    }
}