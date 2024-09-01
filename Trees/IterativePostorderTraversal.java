package Trees;

import java.util.ArrayList;
import java.util.List;

public class IterativePostorderTraversal {
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
    static void postorder(Node root, List<Integer> arr) {
        if (root == null){
            return;
        }
        //traverse left subtree
        postorder(root.left,arr);
        //traverse right subtree
        postorder(root.right,arr);

        arr.add(root.data);
    }

    static List<Integer> postOrder(Node root){
        List<Integer> arr = new ArrayList<>();
        postorder(root,arr);
        return arr;
    }
    static void printList(List<Integer> list){
        for (int num : list){
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting postorder traversal
        List<Integer> result = postOrder(root);

        System.out.print("Postorder traversal: ");
        printList(result);
    }
}

//expected output : Postorder traversal: 4 5 2 3 1
