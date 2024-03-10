class Solution {
    private int result = 0;
    private int[] values;
    private int target;
    
    private void helper(int sum,int index){
        if(index == values.length){
            if(sum == target) result++;
            return;
        }
        
        helper(sum+values[index],index+1);
        helper(sum-values[index],index+1);
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        this.target=target;
        values = nums;
        helper(0,0);
        
        return result;
    }
}