class Solution {
    public int findClosestNumber(int[] nums) {
        int result = nums[0];
        int resultAbs = Math.abs(nums[0]);
        
        for(int i=1;i<nums.length;i++){
            if(resultAbs>Math.abs(nums[i])) {
                resultAbs = Math.abs(nums[i]);
                result = nums[i];
            } else if(resultAbs==Math.abs(nums[i])) {
                result = Math.max(nums[i],result);
            }
        }
        
        return result;
    }
}