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
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        
        int leftPointer = 0;
        int rightPointer = values.size()-1;
        
        while(leftPointer <= rightPointer){
            if (!values.get(leftPointer).equals(values.get(rightPointer))) {
                return false;
            } 
            
            leftPointer++;
            rightPointer--;
        }
        
        return true;
    }
}