class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
        }
        
        int[] result = new int[nums.length];
        
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=0){
                result[i]=(product/nums[i]);
            } else {
                int num=1;
                for(int j=0;j<nums.length;j++) {
                    if(j==i){
                        continue;
                    } else {
                        num*=nums[j];
                    }
                }
                
                result[i]=num;
            }
        }
        
        return result;
    }
}