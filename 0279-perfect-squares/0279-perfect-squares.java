class Solution {
    public int numSquares(int n) {
        int[] DP = new int[n + 1];
        Arrays.fill(DP, Integer.MAX_VALUE);
        DP[0] = 0;
        DP[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (DP[i] > DP[i - j * j] + 1) {
                    DP[i] = DP[i - j * j] + 1;
                }
            }
        }
        
        return DP[n];
    }
}