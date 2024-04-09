class Solution {
    public int minMoves(int[] nums) {
        int minimumNumber = nums[0];
        
        for(int i=1;i<nums.length;i++){
            minimumNumber = Math.min(minimumNumber,nums[i]);
        }
        
        int result = 0;
        
        for(int i=0;i<nums.length;i++){
            result += (nums[i]-minimumNumber);
        }
        
        return result;
    }
}