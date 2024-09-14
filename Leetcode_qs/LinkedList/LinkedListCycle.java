package Leetcode_qs.LinkedList;

//LC141

//slow and fast pointer algorithm
public class LinkedListCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;

        while (fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
