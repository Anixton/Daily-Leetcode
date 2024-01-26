class Solution {
    int MOD = 1_000_000_007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] DP = new int[m][n][maxMove+1];
        for (int[][] l : DP) for (int[] sl : l) Arrays.fill(sl, -1);
        
        return dfs(startRow, startColumn, maxMove, m, n, DP);
    }

    private int dfs(int row, int column, int moveCountLeft, int m, int n, int[][][] DP) {
        if (row < 0 || row == m || column < 0 || column == n) {
            return 1;
        }
        if (moveCountLeft == 0) {
            return 0;
        }
        if (DP[row][column][moveCountLeft] >= 0) {
            return DP[row][column][moveCountLeft];
        }

        DP[row][column][moveCountLeft] = (
            (dfs(row + 1, column, moveCountLeft - 1, m, n, DP) +
            dfs(row - 1, column, moveCountLeft - 1, m, n, DP)) % MOD +
            (dfs(row, column + 1, moveCountLeft - 1, m, n, DP) +
            dfs(row, column - 1, moveCountLeft - 1, m, n, DP)) % MOD
        ) % MOD;

        return DP[row][column][moveCountLeft];
    }
}
