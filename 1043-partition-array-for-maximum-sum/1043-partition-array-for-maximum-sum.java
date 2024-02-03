class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] DP = new int[n];
        
        for (int i = 0; i < n; i++) {
            int currentMax = arr[i];
            for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
                currentMax = Math.max(currentMax, arr[i - j + 1]);
                DP[i] = Math.max(DP[i], (i >= j ? DP[i - j] : 0) + currentMax * j);
            }
        }
        
        return DP[n - 1];
    }
}
