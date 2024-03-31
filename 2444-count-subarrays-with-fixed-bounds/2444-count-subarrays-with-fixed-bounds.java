class Solution {    
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int maxIndex = -1;
        int minIndex = -1;
        int invalidIndex = -1;
        long result = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxK || nums[i]<minK){
                invalidIndex = i;
            }
            
            if(nums[i]==maxK){
                maxIndex = i;
            }
            
            if(nums[i]==minK){
                minIndex = i;
            }
            
            long smaller = Math.min(minIndex,maxIndex);
            long temp = smaller - invalidIndex;
            result += temp>=0 ? temp : 0;
        }
        
        return result;
    }
}