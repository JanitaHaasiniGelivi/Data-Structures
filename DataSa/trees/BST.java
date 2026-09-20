package trees;
import java.util.*;
//copy paste kardhiya prnds
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {

    // Data Member
    TreeNode root;


    // 1. Check if tree is empty
    boolean isTreeEmpty() {
        return root == null;
    }


    // 2. Insert a new node
    // Depth First approach
    void insertNode(int value) {
        TreeNode newNode = new TreeNode(value);
        root = insertRecursive(root, newNode);
    }

    TreeNode insertRecursive(TreeNode r, TreeNode newNode) {

        // If tree/subtree is empty
        if (r == null) {
            return newNode;
        }

        // Smaller value -> left
        if (newNode.data < r.data) {
            r.left = insertRecursive(r.left, newNode);
        }

        // Greater value -> right
        else if (newNode.data > r.data) {
            r.right = insertRecursive(r.right, newNode);
        }

        return r;
    }


    // 3a. Preorder Traversal
    void printPreorder(TreeNode r) {

        if (r == null) {
            return;
        }

        // Root -> Left -> Right
        System.out.print(r.data + " ");

        printPreorder(r.left);
        printPreorder(r.right);
    }


    // 3b. Inorder Traversal
    void printInorder(TreeNode r) {

        if (r == null) {
            return;
        }

        // Left -> Root -> Right
        printInorder(r.left);

        System.out.print(r.data + " ");

        printInorder(r.right);
    }


    // 3c. Postorder Traversal
    void printPostorder(TreeNode r) {

        if (r == null) {
            return;
        }

        // Left -> Right -> Root
        printPostorder(r.left);
        printPostorder(r.right);

        System.out.print(r.data + " ");
    }


    // 3d. Print tree in 2D
    void print2D(TreeNode r, int space) {

        if (r == null) {
            return;
        }

        // Increase distance between levels
        space += 5;

        // First print right subtree
        print2D(r.right, space);

        // Print current node
        System.out.println();

        for (int i = 5; i < space; i++) {
            System.out.print(" ");
        }

        System.out.println(r.data);

        // Print left subtree
        print2D(r.left, space);
    }


    // 3e. Level Order Traversal
    // Breadth First approach
    void printLevelOrder(TreeNode r) {

        if (r == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(r);

        while (!queue.isEmpty()) {

            TreeNode current = queue.remove();

            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }


    // 4. Search
    TreeNode search(TreeNode r, int value) {

        // Value not found
        if (r == null) {
            return null;
        }

        // Value found
        if (r.data == value) {
            return r;
        }

        // Search left
        if (value < r.data) {
            return search(r.left, value);
        }

        // Search right
        return search(r.right, value);
    }


    // 5a. Find minimum value node
    TreeNode minValueNode(TreeNode node) {

        TreeNode current = node;

        // Keep going left
        while (current.left != null) {
            current = current.left;
        }

        return current;
    }


    // 5b. Delete a node
    TreeNode deleteNode(TreeNode r, int value) {

        // Value not found
        if (r == null) {
            return null;
        }

        // Search left
        if (value < r.data) {
            r.left = deleteNode(r.left, value);
        }

        // Search right
        else if (value > r.data) {
            r.right = deleteNode(r.right, value);
        }

        // Node found
        else {

            // Case 1: No child
            if (r.left == null && r.right == null) {
                return null;
            }

            // Case 2: Only right child
            else if (r.left == null) {
                return r.right;
            }

            // Case 3: Only left child
            else if (r.right == null) {
                return r.left;
            }

            // Case 4: Two children
            else {

                // Find smallest value in right subtree
                TreeNode minNode = minValueNode(r.right);

                // Replace current node's value
                r.data = minNode.data;

                // Delete duplicate node
                r.right = deleteNode(r.right, minNode.data);
            }
        }

        return r;
    }
    public class Main {

    public static void main(String[] args) {

        BST tree = new BST();

        // Insert nodes
        tree.insertNode(50);
        tree.insertNode(30);
        tree.insertNode(70);
        tree.insertNode(20);
        tree.insertNode(40);
        tree.insertNode(60);
        tree.insertNode(80);

        System.out.println("Is tree empty? " + tree.isTreeEmpty());

        System.out.println("\nPreorder:");
        tree.printPreorder(tree.root);

        System.out.println("\n\nInorder:");
        tree.printInorder(tree.root);

        System.out.println("\n\nPostorder:");
        tree.printPostorder(tree.root);

        System.out.println("\n\nLevel Order:");
        tree.printLevelOrder(tree.root);

        System.out.println("\n\n2D Tree:");
        tree.print2D(tree.root, 0);


        // Search
        int value = 40;

        TreeNode result = tree.search(tree.root, value);

        if (result != null) {
            System.out.println("\nSearch " + value + ": Found");
        } else {
            System.out.println("\nSearch " + value + ": Not Found");
        }


        // Minimum value
        TreeNode min = tree.minValueNode(tree.root);

        System.out.println("Minimum value: " + min.data);


        // Delete
        System.out.println("\nDeleting 30...");
        tree.root = tree.deleteNode(tree.root, 30);

        System.out.println("Inorder after deletion:");
        tree.printInorder(tree.root);
    }
}
}
