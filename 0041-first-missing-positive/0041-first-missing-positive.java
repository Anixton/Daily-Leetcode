class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(index<0 || index>=nums.length) continue;
            
            else if(nums[index]>0){
                nums[index]*=-1;
            } else if(nums[index] == 0){
                nums[index] = Integer.MIN_VALUE + 1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) return i+1;
        }
        
        return nums.length+1;
    }
}