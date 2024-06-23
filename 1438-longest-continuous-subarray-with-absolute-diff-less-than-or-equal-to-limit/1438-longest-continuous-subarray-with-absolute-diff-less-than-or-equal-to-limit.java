class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<int[]> minN = new ArrayDeque<>();
        Deque<int[]> maxN = new ArrayDeque<>();

        int res = 0;

        for (int l = 0, r = 0; r < nums.length; ++r) {
            while (!minN.isEmpty() && minN.peekLast()[0] >= nums[r]) {
                minN.pollLast();
            }
            while (!maxN.isEmpty() && maxN.peekLast()[0] <= nums[r]) {
                maxN.pollLast();
            }

            minN.offerLast(new int[]{nums[r], r});
            maxN.offerLast(new int[]{nums[r], r});

            while (maxN.peekFirst()[0] - minN.peekFirst()[0] > limit) {
                l = Math.min(maxN.peekFirst()[1], minN.peekFirst()[1]) + 1;
                if (maxN.peekFirst()[1] == l - 1) {
                    maxN.pollFirst();
                }
                if (minN.peekFirst()[1] == l - 1) {
                    minN.pollFirst();
                }
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}