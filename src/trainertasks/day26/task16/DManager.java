package trainertasks.day26.task16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DManager {
    // Singleton instance
    private static DManager instance;

    // Thread-safe list
    private List<String> items;

    // Private constructor
    private DManager() {
        items = Collections.synchronizedList(new ArrayList<>());
    }

    // Public static synchronized method to get instance
    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    // Add item
    public synchronized void addItem(String item) {
        items.add(item);
        System.out.println(item + " added.");
    }

    // Remove item
    public synchronized void removeItem(String item) {
        items.remove(item);
        System.out.println(item + " removed.");
    }

    // List items
    public synchronized void listItems() {
        System.out.println("Current Items: " + items);
    }
}