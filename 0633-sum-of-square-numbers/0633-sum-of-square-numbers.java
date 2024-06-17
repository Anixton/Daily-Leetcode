class Solution {
    private boolean targetFound = false;
    
    private void helper(long left, long right, long target) {
        if(targetFound || right < left) return;
        
        long total = left*left + right*right;
        
        if(total == target) {
            targetFound = true;
        } else if(total > target) {
            helper(left, right - 1, target);
        } else {
            helper(left + 1, right, target);
        }
    }
    
    public boolean judgeSquareSum(int c) {
        long right = (long) Math.sqrt(c);
        long left = 0;
        
        helper(left, right, c);
        return targetFound;
    }
}