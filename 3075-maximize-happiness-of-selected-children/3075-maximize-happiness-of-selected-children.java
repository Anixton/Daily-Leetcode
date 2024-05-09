class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int balancer = 0;
        long result = 0;  
        Arrays.sort(happiness);
        
        while(balancer < k) {
            if(happiness[happiness.length - balancer - 1] - balancer > 0) {
                result += happiness[happiness.length - balancer - 1] - balancer;
                balancer++;
            } else {
                return result;
            }
        }

        return result;
    }
}