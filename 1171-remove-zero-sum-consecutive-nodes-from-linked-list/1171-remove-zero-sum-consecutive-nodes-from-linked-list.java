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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode traverse = head;
        int count = 0;
        
        while (traverse != null) {
            count++;
            traverse = traverse.next;
        }
        
        int[] listNodeArray = new int[count];
        boolean[] isDeleted = new boolean[count];
        
        traverse = head;
        for (int i = 0; i < listNodeArray.length; i++) {
            listNodeArray[i] = traverse.val;
            traverse = traverse.next;
        }
        
        for (int i = 0; i < listNodeArray.length; i++) {
            if (listNodeArray[i] == 0) {
                isDeleted[i] = true;
                continue;
            }
            
            int target = listNodeArray[i] * (-1);
            int total = 0;
            int index = i - 1;
            
            while (total != target && index >= 0) {
                if (!isDeleted[index]) {
                    total += listNodeArray[index];
                }
                
                index--;
            }
            
            if (target == total) {
                for (int j = index + 1; j <= i; j++) {
                    isDeleted[j] = true;
                }
            }   
        }
        
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        for (int i = 0; i < listNodeArray.length; i++) {
            if (!isDeleted[i]) {
                current.next = new ListNode(listNodeArray[i]);
                current = current.next;
            }
        }
        
        return dummy.next;
    }
}
