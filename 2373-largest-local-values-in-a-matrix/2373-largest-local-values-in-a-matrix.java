class Solution {
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length - 2;
        int column = grid[0].length - 2;
        int result[][] = new int[row][];
        for(int i = 0; i < row; i++){
            result[i] = new int[column];
        }
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                int currentRow = i;
                int currentColumn = j;
                int maxValue = 0;
                
                for(int firstIndex = currentRow; firstIndex < currentRow + 3;firstIndex++) {
                    for(int secondIndex = currentColumn; secondIndex < currentColumn + 3; secondIndex++) {
                        maxValue = Math.max(maxValue, grid[firstIndex][secondIndex]);
                    }
                }
                
                result[i][j] = maxValue;
            }
        }
        
        return result;
    }
}