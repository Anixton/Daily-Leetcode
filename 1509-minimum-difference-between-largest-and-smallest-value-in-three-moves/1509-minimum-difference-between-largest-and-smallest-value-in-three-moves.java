class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 4) return 0;
        
        Arrays.sort(nums);
        
        int result = nums[nums.length - 1] - nums[3];
        result = Math.min(result, nums[nums.length - 2] - nums[2]);
        result = Math.min(result, nums[nums.length - 3] - nums[1]);
        result = Math.min(result, nums[nums.length - 4] - nums[0]);
        
        return result;
    }
}