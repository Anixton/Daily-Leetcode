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
    private int maxSoFar = 0;
    private ListNode result = null;
    
    private void helper(ListNode current) {
        if(current == null) return;
        
        helper(current.next);
        
        if(current.val >= maxSoFar) {
            maxSoFar = current.val;
            current.next = result;
            result = current;
        }
    }
    
    public ListNode removeNodes(ListNode head) {
        helper(head);
        return result;
    }
}