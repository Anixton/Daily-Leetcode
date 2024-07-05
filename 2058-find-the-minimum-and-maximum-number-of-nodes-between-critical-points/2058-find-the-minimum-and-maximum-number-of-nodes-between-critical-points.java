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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> indexList = new ArrayList<>();
        
        ListNode previous = head;
        head=head.next;
        int index = 1;
        
        while(head.next != null) {
            if(previous.val < head.val && head.next.val < head.val ) {
                indexList.add(index);
            } else if(previous.val > head.val && head.next.val > head.val ) {
                indexList.add(index);
            }
            
            previous = head;
            head = head.next;
            index++;
        }
        
        if(indexList.size() < 2) {
            int[] empty = new int[2];
            empty[0] = -1;
            empty[1] = -1;
            return empty;
        }
        
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 1; i < indexList.size(); i++) {
            smallest = Math.min(smallest, indexList.get(i) - indexList.get(i - 1));
        }
        
        int largest = indexList.get(indexList.size() - 1) - indexList.get(0);
        
        int[] result = new int[2];
        
        result[0] = smallest;
        result[1] = largest;
        
        return result;
    }
}