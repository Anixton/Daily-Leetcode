public class Solution {

    public int[][] construct2DArray(int[] originalArray, int rowCount, int columnCount) {
        if (!isValidSize(originalArray.length, rowCount, columnCount)) {
            return new int[0][0];
        }

        return fill2DArray(originalArray, rowCount, columnCount);
    }

    private boolean isValidSize(int arrayLength, int rowCount, int columnCount) {
        return arrayLength == rowCount * columnCount;
    }

    private int[][] fill2DArray(int[] originalArray, int rowCount, int columnCount) {
        int[][] twoDArray = new int[rowCount][columnCount];
        int originalArrayIndex = 0;

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                twoDArray[row][column] = originalArray[originalArrayIndex++];
            }
        }

        return twoDArray;
    }
}
