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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode counter = head; 
        int countOfNodes = 0;
        
        while(counter!=null){
            countOfNodes++;
            counter=counter.next;
        }
        
        int targetIndex = countOfNodes - n;
        
        if(targetIndex==0){
            ListNode answer = head.next;
            head.next=null;
            head=null;
            return answer;
        }
        
        ListNode targetFinder = head;
        
        for(int i=0;i<targetIndex-1;i++){
            targetFinder = targetFinder.next;
        }
        
        ListNode toDelete = targetFinder.next;
        targetFinder.next=targetFinder.next.next;
        toDelete=null;
        
        return head;
    }
}