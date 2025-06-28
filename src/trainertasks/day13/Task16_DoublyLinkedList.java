package trainertasks.day13;

public class Task16_DoublyLinkedList {

    static class Node {
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        Node head;
        Node tail;

        // Add node at end
        public void add(Object data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Display forward
        public void displayForward() {
            Node temp = head;
            System.out.println("Forward traversal:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        // Display backward
        public void displayBackward() {
            Node temp = tail;
            System.out.println("Backward traversal:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add("Hari");
        dll.add("Divya");
        dll.add("Vedansh");
        dll.add("Khammam");

        dll.displayForward();
        dll.displayBackward();
    }
}