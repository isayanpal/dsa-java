package Trees;

//iterative inorder traversal using stack

import java.util.ArrayList;
import java.util.List;

public class IterativeInorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }
    public static void inorder(Node root, List<Integer> arr){
        // If the current node is null
        // (base case for recursion), return
        if (root == null) {
            return;
        }
        // Recursively traverse the left subtree
        inorder(root.left, arr);
        // Push the current node's
        // value into the list
        arr.add(root.data);
        // Recursively traverse
        // the right subtree
        inorder(root.right, arr);
    }
    public static List<Integer> inOrder(Node root) {
        // Create an empty list to
        // store inorder traversal values
        List<Integer> arr = new ArrayList<>();
        // Call the inorder traversal function
        inorder(root, arr);
        // Return the resulting list
        // containing inorder traversal values
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = inOrder(root);

        System.out.print("Inorder Traversal: ");
        // Output each value in the
        // inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
//expected output : Inorder Traversal: 4 2 5 1 3