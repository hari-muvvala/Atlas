package trainertasks.day14;

public class Task3_InsertAtEnd {

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
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;

        Node newNode = new Node(40);

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}