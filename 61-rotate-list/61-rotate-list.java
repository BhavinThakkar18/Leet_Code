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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        int length=1;
        ListNode newEndNode  = head;
        ListNode lastNode = head;
        while(lastNode.next!=null)
        {
            length++;
            lastNode = lastNode.next;
            
        }
        k=k%length;
        if(k==0)
        {
            return head;
        }
        for(int i=1;i<length-k;i++)
        {
            newEndNode=newEndNode.next;
            
        }
        ListNode newHead = newEndNode.next;
        newEndNode.next =null;
        lastNode.next = head;
        return newHead;
        
        
    }
}