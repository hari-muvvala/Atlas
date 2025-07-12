package trainertasks.day17;

public class Task2_AVLTree {

    // Node class
    static class AVLNode {
        int key, height;
        AVLNode left, right;

        AVLNode(int key) {
            this.key = key;
            this.height = 1;
        }
    }

    // AVL Tree logic
    static class AVLTree {
        private AVLNode root;

        public void insert(int key) {
            root = insertRec(root, key);
        }

        private AVLNode insertRec(AVLNode node, int key) {
            if (node == null)
                return new AVLNode(key);

            if (key < node.key)
                node.left = insertRec(node.left, key);
            else if (key > node.key)
                node.right = insertRec(node.right, key);
            else
                return node; // Duplicate keys not allowed

            node.height = 1 + Math.max(height(node.left), height(node.right));
            int balance = getBalance(node);

            // Balance the tree using rotations

            // Left Left Case
            if (balance > 1 && key < node.left.key)
                return rightRotate(node);

            // Right Right Case
            if (balance < -1 && key > node.right.key)
                return leftRotate(node);

            // Left Right Case
            if (balance > 1 && key > node.left.key) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

            // Right Left Case
            if (balance < -1 && key < node.right.key) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

            return node;
        }

        private AVLNode rightRotate(AVLNode y) {
            AVLNode x = y.left;
            AVLNode T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        private AVLNode leftRotate(AVLNode x) {
            AVLNode y = x.right;
            AVLNode T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        private int height(AVLNode node) {
            return (node == null) ? 0 : node.height;
        }

        private int getBalance(AVLNode node) {
            return (node == null) ? 0 : height(node.left) - height(node.right);
        }

        public void printInOrder() {
            inOrderTraversal(root);
            System.out.println();
        }

        private void inOrderTraversal(AVLNode node) {
            if (node != null) {
                inOrderTraversal(node.left);
                System.out.print(node.key + " ");
                inOrderTraversal(node.right);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Insert values
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);  // Will trigger right rotation
        tree.insert(25);  // Will trigger left-right rotation
        tree.insert(50);  // Normal insert
        tree.insert(5);   // May trigger rotation

        // Print inorder traversal
        System.out.print("Inorder Traversal: ");
        tree.printInOrder();  // Should print sorted values
    }
}