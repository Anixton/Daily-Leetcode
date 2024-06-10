class Solution {
    public int heightChecker(int[] heights) {
        int[] orderedHeight = heights.clone();        
        Arrays.sort(orderedHeight);
        int result = 0;
        
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != orderedHeight[i]) {
                result++;
            }
        }
        
        return result;
    }
}