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
    public ListNode mergeNodes(ListNode head) {
        ListNode traverse = null;
        ListNode result = null;
        
        int total = 0;
        
        head = head.next;
        while(head != null) {
            if(head.val == 0) {
                if(traverse == null) {
                    ListNode node = new ListNode(total);
                    traverse = node;
                    result = node;
                } else {
                    ListNode node = new ListNode(total);
                    traverse.next = node;
                    traverse = node;
                }
                
                total = 0;
            } else {
                total += head.val;
            }
            
            head = head.next;
        }
        
        return result;
    }
}