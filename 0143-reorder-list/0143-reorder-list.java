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
    public void reorderList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode traverse = head;
        
        while(traverse != null){
            nodeList.add(traverse);
            traverse = traverse.next;
        }
        
        int leftPointer = 0;
        int rightPointer = nodeList.size() - 1;
        boolean turnOnLeft = false;
        ListNode previousElement = nodeList.get(leftPointer++);
        
        while(leftPointer<=rightPointer){
            if(turnOnLeft){
                previousElement.next = nodeList.get(leftPointer++);
                previousElement = previousElement.next;
                turnOnLeft = false;
            } 
            else {
                previousElement.next = nodeList.get(rightPointer--);
                previousElement = previousElement.next;
                turnOnLeft = true;
            }
        }
        
        previousElement.next = null;
        
    }
}