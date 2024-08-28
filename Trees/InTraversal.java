package Trees;


import java.util.ArrayList;
import java.util.List;

public class InTraversal {
    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int data){
            value = data;
            left = null;
            right = null;
        }
    }
    public static void inorder(Node root, List<Integer> arr){
        if (root == null){
            return;
        }
        //recursively traverse the left subtree
        inorder(root.left,arr);

        //push the current node's value into the list
        arr.add(root.value);

        //recursively traverse the right subtree
        inorder(root.right,arr);
    }

    // function to initiate the traversal func and return the resulting list
    static List<Integer> inOrder_Traversal(Node root){
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = inOrder_Traversal(root);

        System.out.print("Inorder Traversal: ");

        for (int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

//expected output: Inorder Traversal: 4 2 5 1 3