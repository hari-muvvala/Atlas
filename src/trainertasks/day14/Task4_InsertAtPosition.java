package trainertasks.day14;

public class Task4_InsertAtPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int position = 2;
        int newValue = 15;
        head = insertAtPosition(head, position, newValue);

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    static Node insertAtPosition(Node head, int position, int value) {
        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("\nInvalid position.");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}