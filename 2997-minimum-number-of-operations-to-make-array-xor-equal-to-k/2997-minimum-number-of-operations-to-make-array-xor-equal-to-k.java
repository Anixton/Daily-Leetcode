class Solution {
    public int minOperations(int[] nums, int k) {
        int current = 0;
        int opCount = 0;
        
        for(int i = 0; i < nums.length; i++) {
            current ^= nums[i];
        }
        
        if(current == k) return 0;
        
        int target = current ^ k;
        
        while(target > 0) {
            opCount++;
            target &= (target - 1);
        }
        
        return opCount;
    }
}