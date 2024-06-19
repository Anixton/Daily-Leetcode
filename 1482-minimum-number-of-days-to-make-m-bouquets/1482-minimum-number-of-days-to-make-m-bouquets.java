class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length) return -1;
        
        int left = 1, right = 1, middle = 1;
        for(int i = 0; i < bloomDay.length; i++) {
            left = Math.min(left, bloomDay[i]);
            right = Math.max(right, bloomDay[i]);
        }
        
        while(left < right) {
            middle = (left + right) / 2;
            
            if(canMake(middle, m, k, bloomDay)){
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        
        return left;
    }
    
    private boolean canMake(int val, int bouquet, int flowers, int[] bloom) {
        int count = 0;
        
        for(int i : bloom) {
            if(i <= val) {
                count++;
                if(count == flowers) {
                    bouquet--;
                    count = 0;
                    
                    if(bouquet == 0) return true;
                }
            } else {
                count = 0;
            }
        }
        
        return false;
    }
}