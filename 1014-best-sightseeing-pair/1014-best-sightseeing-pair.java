class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max_i = values[0] + 0; 
        int max_score = Integer.MIN_VALUE; 
        
        for(int j = 1; j < values.length; j++) {
            max_score = Math.max(max_score, max_i + values[j] - j);
            max_i = Math.max(max_i, values[j] + j);
        }
        
        return max_score;
    }
}