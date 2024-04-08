class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> valuesToInclude = new HashSet<>();
        int result=0;
        
        for(int i=0;i<nums.length;i++){
            valuesToInclude.add(nums[i]);
        }
        
        for(int left=0;left<nums.length;left++){
            HashSet<Integer> candidate = new HashSet<>();
            for(int right=left;right<nums.length;right++){
                candidate.add(nums[right]);
            
                if(valuesToInclude.equals(candidate)) result++;
            }
        }

        return result;
    }
}