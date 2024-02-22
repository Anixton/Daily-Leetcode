class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustCounts = new int[N + 1];
        
        for (int[] relation : trust) {
            trustCounts[relation[0]]--; 
            trustCounts[relation[1]]++; 
        }
        
        for (int i = 1; i <= N; i++) {
            if (trustCounts[i] == N - 1) { 
                return i;
            }
        }
        
        return -1;
    }
}