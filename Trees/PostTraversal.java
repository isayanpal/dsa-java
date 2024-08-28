package Trees;

import java.util.ArrayList;
import java.util.List;

public class PostTraversal {
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

    public static void postorder(Node root,List<Integer> arr){
        if (root == null) {
            return;
        }

        postorder(root.left,arr);
        postorder(root.right,arr);
        arr.add(root.value);
    }

    public static List<Integer> postOrder_Traversal(Node root){
        List<Integer> arr = new ArrayList<>();
        postorder(root,arr);
        return arr;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = postOrder_Traversal(root);

        System.out.print("Postorder Traversal: ");

        for (int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

//expected output : Postorder Traversal: 4 5 2 3 1
