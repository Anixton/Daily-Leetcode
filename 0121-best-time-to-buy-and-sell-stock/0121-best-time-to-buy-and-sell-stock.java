class Solution {
    public int maxProfit(int[] prices) {
        int maxSellPrice = prices[prices.length-1];
        int maximumProfit = 0;
        
        for(int i=prices.length-2;i>=0;i--){
            maximumProfit = Math.max(maxSellPrice-prices[i],maximumProfit);
            maxSellPrice = Math.max(maxSellPrice,prices[i]);
        }
        
        return maximumProfit;
    }
}