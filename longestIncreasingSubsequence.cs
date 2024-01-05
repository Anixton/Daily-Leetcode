// 300 Longest Increasing Subsequence

public class Solution {
    public int LengthOfLIS(int[] nums) {
        int[] DP = new int[nums.Length];
        DP[nums.Length - 1] = 1;

        for (int i = nums.Length - 2; i >= 0; i--) {
            DP[i] = 1;
            for (int j = i + 1; j < nums.Length; j++) {
                if (nums[i] < nums[j] && DP[j] + 1 > DP[i]) {
                    DP[i] = DP[j] + 1;
                }
            }
        }

        int result=DP[0];
        for(int i=1;i<DP.Length;i++)
        {
            if(DP[i]>result){result=DP[i];}
        }

        return result;
    }
}