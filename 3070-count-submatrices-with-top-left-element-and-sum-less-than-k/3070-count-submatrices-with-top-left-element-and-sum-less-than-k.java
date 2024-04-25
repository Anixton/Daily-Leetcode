class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int[][] prefix = new int[grid.length][grid[0].length];
        int result = 0;
        
        prefix[0][0] = grid[0][0];
        
        if(prefix[0][0] <= k) result++;
              
        for(int i = 1; i < grid.length; i++) {
            prefix[i][0] = prefix[i - 1][0] + grid[i][0];
            
            if(prefix[i][0] <= k) result++;
        }
        
        for(int i = 1; i < grid[0].length; i++) {
            prefix[0][i] = prefix[0][i - 1] + grid[0][i];
            
            if(prefix[0][i] <= k) result++;
        }
        
        for(int row = 1; row < grid.length; row++) {
            for(int column = 1; column < grid[0].length; column++) {
                prefix[row][column] = prefix[row - 1][column] + prefix[row][column - 1] - prefix[row - 1][column - 1] + grid[row][column];
                
                if(prefix[row][column] <= k) result++;
            }
        }
        
        return result;
    }
}