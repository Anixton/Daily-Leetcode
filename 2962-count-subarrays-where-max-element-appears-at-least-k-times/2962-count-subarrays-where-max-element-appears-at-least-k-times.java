class Solution {
    public long countSubarrays(int[] nums, int k) {
        long maxNum = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            maxNum = Math.max(maxNum,nums[i]);
        }
        
        long leftPointer = 0;
        long rightPointer = 0;
        long numCount = 0;
        long result = 0;
        
        while(rightPointer < nums.length || leftPointer > rightPointer) {
            if(nums[(int)rightPointer] == maxNum){
                numCount++;
            }
            
            while(numCount >= k){
                if(nums[(int)leftPointer] == maxNum){
                    numCount--;
                }
                leftPointer++;
                result += nums.length-rightPointer;
            }
            rightPointer++;
        }
        
        return result;
    }
}