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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode past = null;
        ListNode current = head;
        ListNode future = head.next;
        
        while(current!=null){
            future = current.next;
            current.next = past;
            past = current;
            current = future;
        }
        
        return past;
    }
}