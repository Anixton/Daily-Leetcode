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
    
    private ListNode modifiedListHead;
    
    private HashSet<Integer> valuesToDelete = new HashSet<Integer>();

    public ListNode modifiedList(int[] nums, ListNode head) {
        modifiedListHead = head;
        initialize(nums);
        deleteValues();

        return modifiedListHead;
    }

    private void initialize(int[] nums) {
        for(int valueToDelete : nums) {
            valuesToDelete.add(valueToDelete);
        }

        while(modifiedListHead != null && 
              valuesToDelete.contains(modifiedListHead.val)) {
            modifiedListHead = modifiedListHead.next;
        }
    }

    private void deleteValues() {
        ListNode left = modifiedListHead;
        ListNode right = modifiedListHead.next;

        while(right != null) {
            if(valuesToDelete.contains(right.val)){
                left.next = right.next;
                right = right.next;
            } else {
                left = right;
                right = right.next;
            }
        }
    }
}