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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        PriorityQueue<ListNode> PQ = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode traverse = head;
        
        while(traverse!=null){
            PQ.offer(traverse);
            traverse=traverse.next;
        }
        
        ListNode newHead = PQ.poll();
        ListNode previous = newHead;
        
        while(!PQ.isEmpty()){
            ListNode current = PQ.poll();
            previous.next=current;
            previous=current;
        }
        
        previous.next = null;
        return newHead;
    }
}