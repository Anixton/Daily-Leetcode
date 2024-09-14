class Solution {

    public int longestSubarray(int[] nums) {
        int maxValue = findMaxValue(nums);
        return countMaxOccurrences(nums, maxValue);
    }

    private int findMaxValue(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    private int countMaxOccurrences(int[] nums, int maxValue) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == maxValue) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;
    }
}
