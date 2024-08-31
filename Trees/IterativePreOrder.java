package Trees;

//iterative preorder traversal using stack

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode (int x){
            val = x;
            left = null;
            right = null;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root){
        //initialize list to store the preorder traversal result
        List<Integer> preorder = new ArrayList<>();

        //if the root is empty ,return an empty traversal result
        if (root == null) {
            return preorder;
        }

        //create a stack to store nodes during traversal
        Stack<TreeNode> st = new Stack<>();
        //push the root node onto the stack
        st.push(root);

        //perform the iterative preorder traversal
        while (!st.isEmpty()){
            //get the current node from the top of the stack
            root = st.pop();

            //add the node's value to the preorder traversal result
            preorder.add(root.val);

            //push the right child onto the stack if exists
            if (root.right != null){
                st.push(root.right);
            }

            //push the left child onto the stack if exists
            if (root.left != null){
                st.push(root.left);
            }
        }
        return preorder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = preorderTraversal(root);

        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
//expected output : Preorder Traversal: 1 2 4 5 3