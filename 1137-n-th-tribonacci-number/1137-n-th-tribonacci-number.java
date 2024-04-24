class Solution {
    public int tribonacci(int n) {
        int[] values = new int[Math.max(n + 1, 3)];
        values[0] = 0;
        values[1] = 1;
        values[2] = 1;
        
        for(int i = 3; i < Math.max(n + 1,3); i++) {
            values[i] = values[i - 1] + values[i - 2] + values[i - 3];
        }
        
        return values[n];
    }
}