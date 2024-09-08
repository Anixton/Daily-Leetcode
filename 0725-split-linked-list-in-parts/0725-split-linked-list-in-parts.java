/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int value;
 * ListNode next;
 * ListNode() {}
 * ListNode(int value) { this.value = value; }
 * ListNode(int value, ListNode next) { this.value = value; this.next = next; }
 * }
 */

class Solution {
    private int basePartSize = 0;
    private int extraNodesCount = 0;

    public ListNode[] splitListToParts(ListNode head, int numberOfParts) {
        calculatePartSizes(head, numberOfParts);
        return distributeParts(head, numberOfParts);
    }

    private void calculatePartSizes(ListNode head, int numberOfParts) {
        ListNode currentNode = head;
        int totalNodes = 0;

        while (currentNode != null) {
            totalNodes++;
            currentNode = currentNode.next;
        }

        basePartSize = totalNodes / numberOfParts;
        extraNodesCount = totalNodes % numberOfParts;

        if (totalNodes < numberOfParts) {
            basePartSize = 1;
            extraNodesCount = 0;
        }
    }

    private ListNode[] distributeParts(ListNode head, int numberOfParts) {
        ListNode[] parts = new ListNode[numberOfParts];
        int partIndex = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            parts[partIndex++] = currentNode;
            int currentPartSize = basePartSize + (extraNodesCount > 0 ? 1 : 0);
            extraNodesCount--;

            for (int steps = 1; steps < currentPartSize; steps++) {
                currentNode = currentNode.next;
            }

            ListNode nextPartHead = currentNode.next;
            currentNode.next = null;
            currentNode = nextPartHead;
        }

        return parts;
    }
}
