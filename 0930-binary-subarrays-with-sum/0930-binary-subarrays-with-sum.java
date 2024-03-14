class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;
        
        for(int i=0;i<nums.length;i++){
            int total = nums[i];
            if(total == goal) result++;
            
            for(int j=i+1;j<nums.length;j++){
                total+=nums[j];
                
                if(total==goal) result++;
                else if(total>goal) break;
            }
        }
        
        return result;
    }
}