package Trees;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}

public class PreTraversal {
    //function to perform preorder traversal of the tree and store values in 'arr'
    static  void preorder (Node root, List<Integer> arr){
        //if the current node is null, return
        if (root == null){
            return;
        }
        //push the current node's value into the list
        arr.add(root.data);
        //recursively traverse the left subtree
        preorder(root.left,arr);
        //recursively traverse the right subtree
        preorder(root.right,arr);
    }

    //function to initiate preorder traversal and return the resulting list
    static List<Integer> preOrder(Node root){
        //create an empty list to store preorder traversal values
        List<Integer> arr = new ArrayList<>();
        //call the preorder traversal function
        preorder(root,arr);
        // return the resulting list containing preorder traversal values
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        //getting preorder traversal
        List<Integer> result = preOrder(root);

        //displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        //output each value in the preorder traversal result
        for (int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

// expected output : Preorder Traversal: 1 2 4 5 3