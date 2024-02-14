class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> negativeQueue = new LinkedList<>();
        Queue<Integer> positiveQueue = new LinkedList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positiveQueue.offer(nums[i]);
            } else {
                negativeQueue.offer(nums[i]);
            }
        }
        
        int currentIndex = 0;
        while(!negativeQueue.isEmpty() || !positiveQueue.isEmpty()){
            nums[currentIndex++]=positiveQueue.poll();
            nums[currentIndex++]=negativeQueue.poll();
        }
        
        return nums;
    }
}