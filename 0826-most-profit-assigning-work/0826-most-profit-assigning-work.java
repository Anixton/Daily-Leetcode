class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int size = 0;
        for(int i = 0; i < difficulty.length; i++) {
            size = Math.max(size, difficulty[i]);
        }
        
        int[] dp = new int[size + 1];
        dp[0] = 0;
        
        for(int i = 0; i < difficulty.length; i++) {
            dp[difficulty[i]] = Math.max(profit[i], dp[difficulty[i]]);
        }
        
        for(int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i],dp[i - 1]);
        }
        
        int total = 0;
        
        for(int i = 0; i < worker.length; i++) {
            total += dp[Math.min(worker[i], dp.length - 1)];
        }
        
        return total;
    }
}