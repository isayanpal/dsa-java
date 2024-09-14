package Leetcode_qs.LinkedList;

//LC142

// slow and fast pointer algorithm
//return the position of the cycle detected

public class LinkedListCycleII {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public ListNode solution(ListNode head){
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode pointer = head;
                while (pointer != slow) {
                    pointer = pointer.next;
                    slow = slow.next;
                }
                return pointer;
            }
        }
        return null;
    }
}
