class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalTimePassed = 0;
        long totalWaitTime = 0;
        
        for(int i = 0; i < customers.length; i++) {
            totalTimePassed = Math.max(totalTimePassed, customers[i][0]) + customers[i][1];
            totalWaitTime += totalTimePassed - customers[i][0];
           
        }
        
        double result = (double)totalWaitTime / customers.length;
        return result;
    }
}