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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode i= head;
        int count=0;
        while(i!=null)
        {
            count++;
            i=i.next;
        }
        //System.out.println(count);
        int temp=count-n;
        i=head;
        if(temp==0)
        {
            i=i.next;
            return i;
        }
        
        while(temp>1)
        {
            i=i.next;
            temp--;
        }
        //System.out.println(i.val);
        ListNode nextNode=i.next;
        i.next=i.next.next;
        nextNode=null;
        
        return head;
    }
}