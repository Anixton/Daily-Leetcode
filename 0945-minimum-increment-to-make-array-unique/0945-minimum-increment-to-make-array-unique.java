class Solution {
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        Arrays.sort(nums);
        int result = 0;
        
        hs.add(nums[0]);
        int maxValueAdded = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(!hs.contains(nums[i])) {
                hs.add(nums[i]);
                maxValueAdded = nums[i];
            } else {
                hs.add(maxValueAdded + 1);
                maxValueAdded++;
                result += maxValueAdded - nums[i];
            }
        }
        
        return result;
    }
}