class Solution {
    public int calculateDigitValue(int num) {
        int current = 0;
        while(num != 0) {
            current += num % 10;
            num /= 10;
        }
        
        return current;
    }
    
    public int differenceOfSum(int[] nums) {
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < nums.length; i++) {
            first += nums[i];
            second += calculateDigitValue(nums[i]);
        }
        
        return Math.abs(first - second);
    }
}