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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        temp.next=null;
        
        ListNode left_side=sortList(head);
        ListNode right_side=sortList(slow);
        
        return merge(left_side,right_side);
    }
    public ListNode merge(ListNode head1,ListNode head2)
    {
        ListNode sorted_temp = new ListNode(0);
        ListNode current = sorted_temp;
        while(head1!=null && head2!=null)
        {
            if(head1.val < head2.val)
            {
                current.next=head1;
                head1=head1.next;
            }
            else
            {
                current.next=head2;
                head2=head2.next;
            }
            current=current.next;
        }
        if(head1!=null)
        {
            current.next=head1;
            head1=head1.next;
        }
        if(head2!=null)
        {
            current.next=head2;
            head2=head2.next;
        }
        return sorted_temp.next;
    }
}