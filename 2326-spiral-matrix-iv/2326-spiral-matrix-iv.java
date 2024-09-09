/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    private static final int EMPTY_CELL = -1; 
    private static final int RIGHT = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int UP = 3;

    private int[][] matrix;
    private int numRows;
    private int numCols;
    private int currentRow;
    private int currentCol;
    private int currentDirection;

    public int[][] spiralMatrix(int numRows, int numCols, ListNode head) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.matrix = new int[numRows][numCols];
        this.currentRow = 0;
        this.currentCol = 0;
        this.currentDirection = RIGHT; 

        initializeMatrix();
        fillMatrixWithListValues(head);
        return matrix;
    }

    private void initializeMatrix() {
        for (int row = 0; row < numRows; row++) {
            Arrays.fill(matrix[row], EMPTY_CELL);
        }
    }

    private void fillMatrixWithListValues(ListNode head) {
        int[][] directionDeltas = {
            {0, 1},  
            {1, 0},  
            {0, -1}, 
            {-1, 0}  
        };

        while (head != null) {
            matrix[currentRow][currentCol] = head.val; 
            head = head.next; 

            int nextRow = currentRow + directionDeltas[currentDirection][0];
            int nextCol = currentCol + directionDeltas[currentDirection][1];

            if (isOutOfBoundsOrFilled(nextRow, nextCol)) {
                currentDirection = (currentDirection + 1) % 4; 
            }

            currentRow += directionDeltas[currentDirection][0];
            currentCol += directionDeltas[currentDirection][1];
        }
    }

    private boolean isOutOfBoundsOrFilled(int row, int col) {
        return row < 0 || row >= numRows || col < 0 || col >= numCols || matrix[row][col] != EMPTY_CELL;
    }
}