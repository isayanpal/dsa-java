package Leetcode_qs.LinkedList;

//LC876

//slow and fast pointer algorithm

public class MiddleNode {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public ListNode middleNode(ListNode head){
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
