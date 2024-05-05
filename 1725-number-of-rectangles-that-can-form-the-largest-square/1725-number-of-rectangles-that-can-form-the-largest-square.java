class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] values = new int[rectangles.length];
        int maximumValue = 0;
        
        for(int i = 0; i < rectangles.length; i++) {
            values[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            maximumValue = Math.max(maximumValue, values[i]);
        }
        
        int result = 0;
        
        for(int i = 0; i < values.length; i++) {
            if(values[i] == maximumValue) {
                result++;
            }
        }
        
        return result;
    }
}