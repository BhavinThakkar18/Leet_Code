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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null)
        {
            return null;
            
        }
        ListNode result = new ListNode(0);
        ListNode current = result;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode it : lists)
        {
            ListNode moving = it;
            while (moving != null) {
                minHeap.offer(moving.val);
                moving = moving.next;
            }
        }
        while (!minHeap.isEmpty()) {
            current.next = new ListNode(minHeap.poll());
            current = current.next;
        }
        return result.next;
    }
}