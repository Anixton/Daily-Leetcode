class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int emptyBottleCount = numBottles;
        int fullBottleCount = 0;
        
        fullBottleCount = numBottles / numExchange;
        emptyBottleCount -= (fullBottleCount * numExchange);
        
        while(fullBottleCount > 0) {
            result += fullBottleCount;
            
            emptyBottleCount += fullBottleCount;
            fullBottleCount = 0;
            
            fullBottleCount = emptyBottleCount / numExchange;
            emptyBottleCount -= (fullBottleCount * numExchange);
        }
        
        return result;
    }
}