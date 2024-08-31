package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostorderTraversalUsingTwoStack {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    public static List<Integer> postOrder(Node root){
        List<Integer> postorder = new ArrayList<>();

        if (root == null) {
            return postorder;
        }

        //Two stacks for iterative traversal
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        //push the root node onto the first stack
        st1.push(root);

        //iterative traversal to populate st2 with nodes in postorder
        while (!st1.isEmpty()){
            // get the top node from st1
            root = st1.pop();

            //push the node onto st2
            st2.push(root);

            //push left child onto st1 if exists
            if (root.left != null) {
                st1.push(root.left);
            }

            //push right child onto st1 if exists
            if (root.right != null){
                st1.push(root.right);
            }
        }
        //populate the postorder traversal list by popping st2
        while (!st2.empty()){
            postorder.add(st2.pop().data);
        }
        //return postorder traversal
        return postorder;
    }

    public static void printList(List<Integer> list){
        for (int num : list){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = postOrder(root);
        System.out.print("Postorder traversal: ");
        printList(result);
    }
}
