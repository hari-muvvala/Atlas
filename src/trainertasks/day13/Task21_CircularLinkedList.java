package trainertasks.day13;

public class Task21_CircularLinkedList {

    // Node class
    static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    // CircularLinkedList class
    static class CircularLinkedList {
        Node head = null;
        Node tail = null;

        // Method to add a node
        public void add(Object data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head; // circular
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head; // connect back to head
            }
        }

        // Method to display the list
        public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node current = head;
            do {
                System.out.print(current.data + " → ");
                current = current.next;
            } while (current != head);

            System.out.println("(back to head)");
        }
    }

    // Main method
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add("Hari");
        cll.add("Divya");
        cll.add("Vedansh");
        cll.add("Khammam");

        System.out.println("Circular Linked List Elements:");
        cll.display();
    }
}