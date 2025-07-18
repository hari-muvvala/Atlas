package trainertasks.day18;

import java.util.*;

public class Task10_CornerNodesBST {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Function to insert nodes in BST
    public static Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.data) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }

    // Function to print corner nodes of each level
    public static void printCornerNodes(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        System.out.println("Corner nodes of each level:");
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node first = null, last = null;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (i == 0) first = current;
                if (i == size - 1) last = current;

                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }

            // Print the first and last node (corner nodes) of this level
            if (first != null) System.out.print(first.data);
            if (last != null && last != first) System.out.print(" " + last.data);
            System.out.println(); // new line per level
        }
    }

    public static void main(String[] args) {
        // Use the trainer's insertion order to match their tree structure
        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};

        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }

        printCornerNodes(root);
    }
}