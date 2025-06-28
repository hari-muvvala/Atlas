package trainertasks.day13;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task3_LinkedList {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;  // first node becomes the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;  // move to last node
            }
            temp.next = newNode;  // attach new node at end
        }
    }

    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;  // delete head
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;  // skip the node to delete
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Task3_LinkedList list = new Task3_LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}