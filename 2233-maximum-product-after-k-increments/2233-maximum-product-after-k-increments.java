import java.util.PriorityQueue;

class Solution {
    private  final int MOD = 1000000007;
    
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            PQ.add(nums[i]);
        }

        while(k != 0) {
            int minimumValue = PQ.poll();
            PQ.add(minimumValue + 1);
            k--;
        }

        long result = 1;
        while(!PQ.isEmpty()) {
            result *= PQ.poll();
            result %= MOD;
        }

        return (int) result;
    }
}