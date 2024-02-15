class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        
        for(int polygonSize=nums.length;polygonSize>2;polygonSize--){
            long  sum=total;
            for(int lastIndex=nums.length-1;lastIndex>=polygonSize-1;lastIndex--){
                sum-=nums[lastIndex];
                if(sum>nums[lastIndex]){
                    return (long)(sum+nums[lastIndex]);
                }
            }
        }
        
        return -1;
    }
}