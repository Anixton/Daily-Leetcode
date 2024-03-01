class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i=0;i<nums.length;i++){
            PQ.add(nums[i]);
        }
        
        for(int i=0;i<k-1;i++){
            PQ.poll();
        }
        
        return PQ.poll();
    }
}