class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> oddIndices = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) {
                oddIndices.add(i);
            }
        }
        
        if(oddIndices.size() < k) return 0;
        
        int result = 0;
        
        for(int i = 0; i <= oddIndices.size() - k; i++) {
            int leftOption = i == 0 ? oddIndices.get(i) + 1 : oddIndices.get(i) - oddIndices.get(i - 1);
            int rightOption = i + k == oddIndices.size() ? nums.length - oddIndices.get(i + k - 1) : oddIndices.get(i + k) - oddIndices.get(i + k - 1);
            
            result += leftOption * rightOption;
        }
        
        return result;
    }
}