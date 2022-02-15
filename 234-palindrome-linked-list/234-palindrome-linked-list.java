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
    public boolean isPalindrome(ListNode head) {
        boolean ans=true;
        String list="";
        while(head!=null)
        {
            list+=(head.val);
            head=head.next;
        }
        int i=0;
        int j=list.length()-1;
        while(i<=j)
        {
            if(list.charAt(i)!=list.charAt(j))
            {
                ans=false;
                break;
            }
            i++;
            j--;
        }
        return ans;
    }
}