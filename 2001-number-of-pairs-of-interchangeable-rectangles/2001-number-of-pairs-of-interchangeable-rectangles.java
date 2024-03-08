class Solution {
    private long result = 0;
    
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long> map = new HashMap<Double,Long>();
        
        for(int i=0;i<rectangles.length;i++){
            double currentValue = (double) rectangles[i][1]/rectangles[i][0];
            
            if(map.containsKey(currentValue)){
                map.put(currentValue,map.get(currentValue)+1);
            } else {
                map.put(currentValue,(long)1);
            }
        }
        
        for(Long i : map.values()){
            result += (i-1)*i/2;
        }
        
        return result;
    }
}