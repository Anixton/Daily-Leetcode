class Solution {
    public int passThePillow(int n, int time) {
        int MOD = 2 * (n - 1);
        time %= MOD;
        
        int result = 1 + time;
        
        if(result > n) {
            int difference = result % n;
            result = n - difference;
        }
        
        return result;
    }
}