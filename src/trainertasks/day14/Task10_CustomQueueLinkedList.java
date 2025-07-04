package trainertasks.day14;

public class Task10_CustomQueueLinkedList {

    static class CustomQueue {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node front = null;
        Node rear = null;
        int size = 0;
        final int maxSize = 5;

        boolean isEmpty() {
            return front == null;
        }

        boolean isFull() {
            return size == maxSize;
        }

        void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot insert " + value);
                return;
            }

            Node newNode = new Node(value);

            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            size++;
            System.out.println("Enqueued: " + value);
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return;
            }

            System.out.println("Dequeued: " + front.data);
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }

        void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. No element to peek.");
            } else {
                System.out.println("Peek element: " + front.data);
            }
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            Node current = front;
            System.out.print("Queue: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.peek();
        q.dequeue();
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue(); // Trying to dequeue from empty

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90); // Will not be added (full)
        q.display();
    }
}