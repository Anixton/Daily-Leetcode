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
    private int result = 0;
    private int whatsLeft = 0;
    
    private void helper(ListNode current) {
        if(current == null) {
            return;
        }
        
        helper(current.next);
        int currentNum = (current.val * 2) + whatsLeft;
        
        if(currentNum >= 10) {
            current.val = (currentNum - 10);
            whatsLeft = 1;
        } else {
            current.val = currentNum;
            whatsLeft = 0;
        }
    }
    public ListNode doubleIt(ListNode head) {
        helper(head);
        if(whatsLeft == 1) {
            ListNode node = new ListNode(whatsLeft,head);
            return node;
        }
        return head;
    }
}