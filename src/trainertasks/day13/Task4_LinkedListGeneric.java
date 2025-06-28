package trainertasks.day13;

public class Task4_LinkedListGeneric {

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList<T> {
        Node<T> head;

        public void addAtEnd(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void remove(T value) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            if (head.data.equals(value)) {
                head = head.next;
                return;
            }

            Node<T> current = head;
            Node<T> previous = null;

            while (current != null && !current.data.equals(value)) {
                previous = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println("Value not found in the list.");
                return;
            }

            previous.next = current.next;
        }

        public void display() {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        public int getSize() {
            int count = 0;
            Node<T> temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public T getElementAt(int index) {
            Node<T> temp = head;
            int count = 0;

            while (temp != null) {
                if (count == index) {
                    return temp.data;
                }
                temp = temp.next;
                count++;
            }

            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + count);
        }
    }

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();

        list.addAtEnd(10);
        list.addAtEnd("Hello");
        list.addAtEnd(3.14f);
        list.addAtEnd(true);

        System.out.println("Before removal:");
        list.display();
        System.out.println("Size before removal: " + list.getSize());

        list.remove("Hello");
        list.remove(100);

        System.out.println("After removal:");
        list.display();
        System.out.println("Size after removal: " + list.getSize());

        try {
            System.out.println("Element at index 1: " + list.getElementAt(1));
            System.out.println("Element at index 10: " + list.getElementAt(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}