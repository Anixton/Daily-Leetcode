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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode startingPoint = list1;
        ListNode endingPoint = list1;
        
        for(int i=0;i<a-1;i++){
            startingPoint = startingPoint.next;
        }
        
        for(int i=0;i<b+1;i++){
            endingPoint = endingPoint.next;
        }
        
        startingPoint.next = list2;
        ListNode secondEnd = list2;
        
        while(secondEnd.next != null){
            secondEnd = secondEnd.next;
        }
        
        secondEnd.next = endingPoint;
        return list1;
    }
}