class Solution {
    private int[] original;
    private int[] shuffledArr;

    public Solution(int[] nums) {
        original=nums;
    }
    
    public int[] reset() {
        return original;
    }
    
    public int[] shuffle() {
        List<Integer> possibleValues = new ArrayList<>();
        Random rand = new Random();
        
        for(int i=0;i<original.length;i++){
            possibleValues.add(original[i]);
        }
        
        int[] result = new int[original.length];
        
        for(int i=0;i<original.length;i++){
            int x = rand.nextInt(possibleValues.size());
            result[i]=possibleValues.get(x);
            possibleValues.remove(x);
        }
        
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */