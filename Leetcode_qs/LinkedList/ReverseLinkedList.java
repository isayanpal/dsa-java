package Leetcode_qs.LinkedList;

//LC206

public class ReverseLinkedList {
     class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head){
         ListNode prev = null;
         ListNode cur = head;

         while (cur != null){
             ListNode temp = cur.next;
             cur.next = prev;
             prev = cur;
             cur = temp;
         }

         return prev;
    }
}
