package trainertasks.day18;

import java.util.*;

public class Task10A_CornerNodesTrainerVersion {

    static class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static class BinaryTreeCornerNodes {
        Node root;

        void printCornerNodes(Node root) {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int size = q.size();
                //System.out.println(size);

                for (int i = 0; i < size; i++) {
                    Node temp = q.poll();

                    // Print the first and last node of each level
                    if (i == 0 || i == size - 1) {
                        System.out.print(temp.key + " ");
                    }

                    if (temp.left != null) q.add(temp.left);
                    if (temp.right != null) q.add(temp.right);
                }
                System.out.println(); // Line break after each level
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeCornerNodes tree = new BinaryTreeCornerNodes();

        // Trainer's custom hardcoded tree structure
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(15);

        tree.printCornerNodes(tree.root);
    }
}