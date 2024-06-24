class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        int flipped = 0;
        int[] flip = new int[n]; 

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipped ^= flip[i - k];
            }

            if ((nums[i] ^ flipped) == 0) { 
                if (i + k > n) {
                    return -1; 
                }

                flip[i] = 1; 
                flipped ^= 1; 
                result++;
            }
        }

        return result;
    }
}
