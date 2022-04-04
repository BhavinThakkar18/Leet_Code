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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode n = head;
        int count=0;
        while(n!=null)
        {
            n=n.next;
            count++;
        }
        ListNode first=head;
        ListNode second=head;
        for(int i=1;i<k;i++)
        {
            first=first.next;
        }
        for(int i=0;i<count-k;i++)
        {
            second=second.next;
        }
        int temp=second.val;
        second.val=first.val;
        first.val=temp;
        return head;
    }
}