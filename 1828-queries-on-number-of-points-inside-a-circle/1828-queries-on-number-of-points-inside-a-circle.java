class Solution {
    private double findDistance(int firstX, int firstY, int secondX, int secondY){
        double first = (double) (firstX-secondX);
        double second = (double) (firstY-secondY);
        
        first*=first;
        second*=second;
        
        return Math.sqrt(first+second);
    }
    
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<points.length;j++){
                if(queries[i][2]>=findDistance(queries[i][0],queries[i][1],points[j][0],points[j][1])){
                    result[i]++;
                }
            }
        }
        
        return result;
    }
}