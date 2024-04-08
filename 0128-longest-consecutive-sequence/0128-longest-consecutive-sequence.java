class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int highScore = 0;
        
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]-1)) continue;
            
            int currentScore = 1;
            int number = nums[i];
            
            while(hs.contains(number+1)){
                currentScore++;
                number++;
            }
            
            highScore = Math.max(highScore,currentScore);
        }
        
        return highScore;
    }
}