package Trees;

public class Intro {
    // Binary Tree representation in java
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int key){
            data = key;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
    }
}
