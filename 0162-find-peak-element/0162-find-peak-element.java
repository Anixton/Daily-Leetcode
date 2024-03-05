class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        
        if(nums[0]>nums[1]){
            return 0;
        }
        
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        
        int leftPointer=1;
        int rightPointer=nums.length-2;
        
        while(leftPointer<=rightPointer){
            int middle=(leftPointer+rightPointer)/2;
            
            if(nums[middle]>nums[middle+1] && nums[middle]>nums[middle-1]){
                return middle;
            } else if(nums[middle+1]<nums[middle]){
                rightPointer=middle-1;
            } else {
                leftPointer=middle+1;
            }
        }
        
        return 0;
    }
}