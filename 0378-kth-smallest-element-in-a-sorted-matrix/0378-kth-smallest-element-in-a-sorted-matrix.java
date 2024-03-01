class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                PQ.add(matrix[i][j]);
            }
        }
        
        for(int i=1;i<k;i++){
            PQ.poll();
        }
        
        return PQ.poll();
    }
}
