class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
        
        for(int i=0;i<trips.length;i++){
            while (!PQ.isEmpty() && PQ.peek()<=trips[i][1]){
                PQ.poll();
            }
                
            for(int j=0;j<trips[i][0];j++){
                PQ.add(trips[i][2]);
            }
            
            if(PQ.size()>capacity) return false;
        }
        
        return true;
    }
}