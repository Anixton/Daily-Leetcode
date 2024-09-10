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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode left = head;
        ListNode right = head.next;

        while(right != null) {
            int nodeValue = findGCD(left.val, right.val);
            ListNode node = new ListNode(nodeValue);

            left.next = node;
            node.next = right;

            left = right;
            right = right.next;
        }

        return head;
    }

    private int findGCD(int firstNum, int secondNum) {
        while(secondNum != 0) {
            int temp = secondNum;
            secondNum = firstNum % secondNum;
            firstNum = temp;
        }

        return firstNum;
    }
}