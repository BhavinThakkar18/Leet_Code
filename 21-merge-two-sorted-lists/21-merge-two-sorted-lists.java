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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i1=list1;
        ListNode i2=list2;
        ListNode list3=new ListNode(0);
        ListNode current_node=list3;
        if(i1==null) return i2;
        if(i2==null) return i1;
        while(i1!=null && i2!=null)
        {
            if(i1.val<i2.val)
            {
                current_node.next=i1;
                i1=i1.next;
            }
            else
            {
                current_node.next=i2;
                i2=i2.next;
            }
            current_node=current_node.next; 
        }
        if(i1!=null)
        {
            current_node.next=i1;
            i1=i1.next;
        }
        if(i2!=null)
        {
            current_node.next=i2;
            i2=i2.next;
        }
        return list3.next;
    }
}