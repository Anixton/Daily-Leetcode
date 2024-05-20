class Solution {
    private int result = 0;

    private void helper(int[] nums, int index, int current) {
        if(index == nums.length) {
            result += current; 
            return;
        }
        
        helper(nums, index + 1, current);
        
        current ^= nums[index];
        helper(nums, index + 1, current);
    }
    
    public int subsetXORSum(int[] nums) {
        helper(nums,0,0);
        return result;
    }
}