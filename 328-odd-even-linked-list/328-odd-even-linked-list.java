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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode next_head=even;
        ListNode ans_head=odd;
        ListNode ans = new ListNode(0);
        ListNode dummy_head = head;
        int c=1;
        while(dummy_head!=null)
        {
            if((c%2)==1)
            {
                odd.next=dummy_head;
                odd=odd.next;
            }
            else
            {
                even.next=dummy_head;
                even=even.next;
            }
            dummy_head=dummy_head.next;
            c++;
        }
        odd.next=next_head.next;
        even.next=null;
        return ans_head.next;
    }
}