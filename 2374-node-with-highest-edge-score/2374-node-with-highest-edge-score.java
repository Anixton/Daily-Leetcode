class Solution {
    public int edgeScore(int[] edges) {
        int result = 0;
        long[] scoreArray = new long[edges.length];
        for(int i=0;i<edges.length;i++){
            scoreArray[edges[i]]+=(long)i;
            
            if(scoreArray[edges[i]]>scoreArray[result]){
                result = edges[i];
            } else if(scoreArray[edges[i]]==scoreArray[result]){
                result = Math.min(result,edges[i]);
            }
        }
        
        return result;
    }
}