class Solution {
    public int matrixScore(int[][] grid) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;
        
        for (int i = 0; i < rowCount; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < columnCount; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        
        for (int j = 1; j < columnCount; j++) {
            int countOfZeros = 0;
            for (int i = 0; i < rowCount; i++) {
                if (grid[i][j] == 0) {
                    countOfZeros++;
                }
            }
            if (countOfZeros > rowCount / 2) {
                for (int i = 0; i < rowCount; i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        
        int result = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                result += grid[i][j] * Math.pow(2, columnCount - j - 1);
            }
        }
        
        return result;
    }
}