package Leetcode_qs.LinkedList;

//LC138

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    class Node{
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head){
        if (head == null){
            return null;
        }
        Map<Node, Node> oldToNew = new HashMap<>();
        Node curr = head;

        //First pass: create all nodes and put them in the map
        while (curr != null){
            oldToNew.put(curr,new Node(curr.val));
            curr = curr.next;
        }

        //Second pass : set next and random pointers
        curr = head;
        while (curr != null){
            Node newNode = oldToNew.get(curr);
            newNode.next = oldToNew.get(curr.next);
            newNode.random = oldToNew.get(curr.random);
            curr = curr.next;
        }

        return oldToNew.get(head);
    }
}
