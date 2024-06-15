class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<int[]> minCapitalHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int current = w;
        
        for (int i = 0; i < profits.length; i++) {
            minCapitalHeap.add(new int[]{capital[i], profits[i]});
        }
        
        for(int i = 0; i < k; i++) {
            while(!minCapitalHeap.isEmpty() && minCapitalHeap.peek()[0] <= current) {
                PQ.add(minCapitalHeap.poll()[1]);
            }
            
            if(PQ.isEmpty()) return current;
            
            current += PQ.poll();
        }
        
        return current;
    }
}