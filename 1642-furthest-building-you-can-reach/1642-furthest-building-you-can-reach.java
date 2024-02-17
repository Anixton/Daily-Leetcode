class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
         PriorityQueue<Integer> ladderUsed = new PriorityQueue<>();
            
         for(int i=1;i<heights.length;i++){
             int diff = heights[i] - heights[i - 1];
             if (diff > 0) {
                if (ladders > 0) {
                    ladderUsed.offer(diff);
                    if (ladderUsed.size() > ladders){
                        bricks -= ladderUsed.poll();
                        if(bricks < 0) return i - 1;
                    }    
                } else {
                    bricks -= diff;
                    if (bricks < 0) return i - 1;
                }
            } 
         }
        
         return heights.length-1;
    }
}