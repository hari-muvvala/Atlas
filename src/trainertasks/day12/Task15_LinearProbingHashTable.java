public class Task15_LinearProbingHashTable {

    public static void main(String[] args) {
        HashTable<String, String> ht = new HashTable<>();

        ht.put("Hari", "Engineer");
        ht.put("Divya", "Doctor");
        ht.put("Ravi", "Writer");

        ht.printTable();
    }
}

class HashTable<Key, Value> {

    private class HashTableNode {
        private Key key;
        private Value value;
        private boolean active;
        private boolean tombstoned;

        public HashTableNode() {
            key = null;
            value = null;
            active = false;
            tombstoned = false;
        }

        public HashTableNode(Key initKey, Value initData) {
            key = initKey;
            value = initData;
            active = true;
            tombstoned = false;
        }
    }

    private final static int TABLE_SIZE = 9;
    private Object[] table;

    public HashTable() {
        table = new Object[TABLE_SIZE];
        for (int j = 0; j < TABLE_SIZE; j++)
            table[j] = new HashTableNode();
    }

    private int hash(Key key) {
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    public Value put(Key key, Value value) {
        int index = hash(key);
        int startIndex = index;

        do {
            @SuppressWarnings("unchecked")
            HashTableNode node = (HashTableNode) table[index];

            if ((!node.active && !node.tombstoned) || (node.key.equals(key))) {
                table[index] = new HashTableNode(key, value);
                return null;
            }

            index = (index + 1) % TABLE_SIZE;

        } while (index != startIndex);

        return null;
    }

    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            @SuppressWarnings("unchecked")
            HashTableNode node = (HashTableNode) table[i];
            if (node.active)
                System.out.println("[" + i + "] " + node.key + ": " + node.value);
            else
                System.out.println("[" + i + "] Empty");
        }
    }
}