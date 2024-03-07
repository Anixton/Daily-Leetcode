class Solution {
    private boolean allZero(int[] nums){

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return false;
            }
        }
        
        return true;
    }
    public int minOperations(int[] nums) {
        int result=0;
        
        while(true){
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2!=0){
                    result++;
                    nums[i]--;
                }
            }
            
            if(allZero(nums)){
                return result;
            }
            
            result++;
            
            for(int i=0;i<nums.length;i++){
                nums[i]/=2;
            }
            
            
            if(allZero(nums)){
                return result;
            }
        }
    }  
}