package trainertasks.day18;

import java.util.LinkedList;

public class Task1_HashTable {
    LinkedList<Entry>[] data = new LinkedList[5];

    public void put(String key, int value) {
        int index = Math.abs(key.hashCode() % data.length);

        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }

        for (Entry e : data[index]) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }

        data[index].add(new Entry(key, value));
    }

    public void printHashTable() {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Index " + i + ": ");
            if (data[i] != null) {
                for (Entry e : data[i]) {
                    System.out.print("[" + e.key + ", " + e.value + "] ");
                }
            } else {
                System.out.print("null");
            }
            System.out.println();
        }
    }

    static class Entry {
        String key;
        int value;

        Entry(String k, int v) {
            key = k;
            value = v;
        }
    }

    public static void main(String[] args) {
        Task1_HashTable ht = new Task1_HashTable();

        ht.put("apple", 10);
        ht.put("banana", 20);
        ht.put("mango", 30);
        ht.put("grape", 40);
        ht.put("lemon", 50);
        ht.put("banana", 25); // Update value for "banana"

        ht.printHashTable();
    }
}