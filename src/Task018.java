import java.util.*;
import java.util.function.Consumer;

public class Task018 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        // 1. Iterator loop
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value: " + i);
        }

        // 2. Anonymous class with forEach
        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value: " + t);
            }
        });

        // 3. Reusable Consumer class
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}

class MyConsumer implements Consumer<Integer> {
    public void accept(Integer t) {
        System.out.println("Consumer impl Value: " + t);
    }
}