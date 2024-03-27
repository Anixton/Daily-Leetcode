class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int subarrayCount = 0;
        int currentProduct = 1;
        int left = 0;
        int right = 0;
        
        while(right < nums.length){
            currentProduct *= nums[right];
            
            while(left<=right && currentProduct >=k){
                currentProduct /= nums[left++];
            }
            if(left<=right){subarrayCount+= (right-left+1);}
            right++;
        }
        
        return subarrayCount;
    }
}