class Solution {
    private int result = 0;
    private int resultCount = 0;
    
    private void helper(int current,int[] nums, int index){
        if(index==nums.length) return;
        
        helper(current,nums,index+1);
        current |= nums[index];
        if(current > result){
            result = current;
            resultCount = 1;
        } else if(current == result){
            resultCount++;
        }
        
        helper(current,nums,index+1);
    }
    
    public int countMaxOrSubsets(int[] nums) {
        helper(0,nums,0);
        
        return resultCount;
    }
}