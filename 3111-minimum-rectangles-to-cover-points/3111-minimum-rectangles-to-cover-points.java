class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        
        int index = 0;
        int result = 0;
        
        while(index < points.length) {
            int startingPos = points[index][0];
            
            while(index < points.length && points[index][0] - startingPos <= w) {
                index++;
            }
            
            result++;
        }
        
        return result;
    }
}