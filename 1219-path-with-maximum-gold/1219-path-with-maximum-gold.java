class Solution {
    private int result = 0;
    
    private void helper(int[][] grid, int row, int column, int total) {
        int originalValue = grid[row][column];
        total += originalValue;
        grid[row][column] = 0;
        
        result = Math.max(result, total);
        
        if(row + 1 < grid.length && grid[row + 1][column] != 0) {
            helper(grid, row + 1, column, total);
        }
        
        if(row - 1 >= 0 && grid[row - 1][column] != 0) {
            helper(grid, row - 1, column, total);
        }
        
        if(column + 1 < grid[0].length && grid[row][column + 1] != 0) {
            helper(grid, row, column + 1, total);
        }
        
        if(column - 1 >= 0 && grid[row][column - 1] != 0) {
            helper(grid, row, column - 1, total);
        }

        grid[row][column] = originalValue;
    }
    
    public int getMaximumGold(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0) {
                    helper(grid, i, j, 0);
                }
            }
        }
        
        return result;
    }
}