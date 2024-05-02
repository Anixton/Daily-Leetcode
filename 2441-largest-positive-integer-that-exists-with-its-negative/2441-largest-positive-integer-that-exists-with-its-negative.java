class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int result = -1;
        
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
            
            if(Math.abs(nums[i]) > result && hs.contains(-1 * nums[i])){
                result = Math.abs(nums[i]);
            }
        }
        
        return result;
    }
}