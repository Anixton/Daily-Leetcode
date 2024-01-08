public class Solution {
    public int MaximumStrongPairXor(int[] nums) {
        int maxResult=int.MinValue;
        Array.Sort(nums);
        for(int i=0;i<nums.Length;i++)
        {
            for(int j=0;j<nums.Length;j++)
            {
                int current=Math.Abs(nums[j]-nums[i]);
                if(current<=Math.Min(nums[i],nums[j]) && (nums[i]^nums[j])>maxResult)
                {
                    maxResult=nums[i]^nums[j];
                }
            }
        }
        return maxResult;
    }
}