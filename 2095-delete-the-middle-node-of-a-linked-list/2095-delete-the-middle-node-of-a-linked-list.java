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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        
        ListNode oneStep = head;
        ListNode twoStep = head;
        ListNode behindOneStep = null;
        
        while(twoStep.next != null){
            behindOneStep = oneStep;
            oneStep = oneStep.next;
            twoStep = twoStep.next;
            if(twoStep.next!=null) twoStep=twoStep.next;
        }
        
        behindOneStep.next = oneStep.next;
        oneStep.next = null;
        
        return head;
    }
}