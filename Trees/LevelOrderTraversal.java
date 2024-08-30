package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        // default constructor
        TreeNode (){
            this.val = 0;
            this.left = null;
            this.right = null;
        }

        //constructor with a value parameter for treenode
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }

    // function to perform level order traversal of a binary tree
    public static List<List<Integer>> levelOrder(TreeNode root){
        //create a list of lists to store levels
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            //if the tree is empty return empty list
            return ans;
        }

        //create queue to store nodes for level order traversal
        Queue<TreeNode> q = new LinkedList<>();
        //push the root node to the queue
        q.add(root);

        while(!q.isEmpty()){
            //get the size of the current level
            int size = q.size();
            //create a list to store nodes at the current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++){
                //get the front node in the queue
                TreeNode node  = q.poll();
                //store the node value in the current level list
                level.add(node.val);

                //enqueue the child nodes if they exist
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
            }
            // store the current level in the answer list
            ans.add(level);
        }
        //return the level order traversal of the tree
        return ans;
    }

    //function to print the elements of a list
    static void printList(List<Integer> list){
        //iterate through the list and print the element
        for (int num : list){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
         root.right.left = new TreeNode(6);
         root.right.right = new TreeNode(7);

         //perform the level order traversal
         List<List<Integer>> result = levelOrder(root);

        System.out.println("Level Order Traversal of Tree: ");

        for (List<Integer> level : result){
            printList(level);
        }
    }
}

//Level Order Traversal of Tree:
//        1
//        2 3
//        4 5 6 7