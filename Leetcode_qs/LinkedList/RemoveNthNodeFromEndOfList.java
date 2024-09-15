package Leetcode_qs.LinkedList;

//LC19

public class RemoveNthNodeFromEndOfList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode behind = dummy, ahead = dummy;

        for (int i = 0; i <= n; i++){
            ahead = ahead.next;
        }
        while(ahead != null){
            behind = behind.next;
            ahead = ahead.next;
        }
        behind.next = behind.next.next;

        return dummy.next;
    }
}
