class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countOfNums = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if (countOfNums.containsKey(nums[i])) {
                countOfNums.put(nums[i], countOfNums.get(nums[i]) + 1);
            } else {
                countOfNums.put(nums[i], 1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        for (Map.Entry<Integer, Integer> entry : countOfNums.entrySet()) {
            priorityQueue.offer(entry);
        }

        int[] result = new int[k];
        
        for(int i = 0; i<k;i++){
            result[i]=priorityQueue.poll().getKey();
        }
        
        return result;
    }
}