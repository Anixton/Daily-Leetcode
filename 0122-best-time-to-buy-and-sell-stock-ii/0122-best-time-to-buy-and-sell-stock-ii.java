class Solution {
    private int shibaInu = 0;
    public int maxProfit(int[] prices) {
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                shibaInu+=prices[i]-prices[i-1];
            }
        }
        
        return shibaInu;
    }
}