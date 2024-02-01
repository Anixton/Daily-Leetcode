class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3][3];

        for(int i = 0; i < nums.length; i++){
            result[i/3][i%3] = nums[i];
        }
        
        for(int row = 0; row < result.length; row++){
            if(result[row][2] - result[row][0] > k){
                    return new int[0][];
            }
        }
        
        return result;
    }
}