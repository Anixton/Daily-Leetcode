class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> PQ = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<piles.length;i++){
            PQ.add(piles[i]);
        }
        
        while(k>0){
            int currentValue = PQ.poll();
            
            if(currentValue%2==0){
                PQ.add(currentValue/2);
            } else {
                PQ.add((currentValue+1)/2);
            }
            
            k--;
        }
        
        int result = 0;
        
        while(!PQ.isEmpty()){
            result+=PQ.poll();
        }
        
        return result;
    }
}