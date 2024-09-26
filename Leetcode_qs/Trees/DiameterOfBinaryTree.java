package Leetcode_qs.Trees;

//LC543

public class DiameterOfBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val = x;
        }
    }
    private int largestDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root){
        height(root);
        return largestDiameter;
    }
    private int height(TreeNode node){
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int diameter = leftHeight + rightHeight;

        largestDiameter = Math.max(largestDiameter,diameter);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
