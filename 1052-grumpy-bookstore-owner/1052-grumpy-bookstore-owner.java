class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int result = 0;
        
        for(int i = 0; i < customers.length; i++) {
            if(grumpy[i] == 0) {
                result += customers[i];
            }
        }
        
        for(int i = 0; i < minutes; i++) {
            if(grumpy[i] == 1) {
                result += customers[i];
            }
        }
        
        int previous = result;
        
        for(int i = 1; i <= grumpy.length - minutes; i++) {
            int current = previous;
            if(grumpy[i - 1] == 1) {
                current -= customers[i - 1];
            }
            
            if(grumpy[i + minutes - 1] == 1) {
                current += customers[i + minutes - 1];
            }
            
            previous = current;
            result = Math.max(current, result);
        }
        
        return result;
    }
}