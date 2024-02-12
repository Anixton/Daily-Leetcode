class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int currentMajority = nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==currentMajority){
                count++;
            } else {
                count--;
                if(count==0){
                    count=1;
                    currentMajority = nums[i];
                }
            }
        }
        
        return currentMajority;
    }
}