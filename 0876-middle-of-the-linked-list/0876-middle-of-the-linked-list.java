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
    public ListNode middleNode(ListNode head) {
        ListNode twoStep = head;
        ListNode oneStep = head;
        
        while(twoStep!=null){
            twoStep = twoStep.next;
            
            if(twoStep==null ) return oneStep;
            
            twoStep = twoStep.next;
            oneStep = oneStep.next;
        }
        
        return oneStep;
    }
}