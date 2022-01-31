/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head.next==null)
        {
            return null;
        }
        //find out the middle element
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=head;
        //find out the prev of middle element
        while(prev.next!=slow)
        {
            prev=prev.next;
        }
        //remove middle element
        prev.next=slow.next;
        slow.next=null;
        return head;
    }
}