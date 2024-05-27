class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int[] countArray = new int[nums.length + 1];
        
        for(int i = 0; i < countArray.length; i++) {
            for(int num : nums) {
                if(num >= i) {
                    countArray[i]++;
                }
            }
        }
        
        for(int i = 0; i < countArray.length; i++) {
            if(countArray[i] == i) return i;
        }
        
        return -1;
    }
}