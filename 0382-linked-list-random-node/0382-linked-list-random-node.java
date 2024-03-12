import java.util.Random;

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
    private ListNode start;
    private int length = 0;
    private Random random = new Random();

    public Solution(ListNode head) {
        start = head;
        while (head != null) {
            head = head.next;
            length++;
        }
    }
    
    public int getRandom() {
        int index = random.nextInt(length);
        ListNode node = start;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */