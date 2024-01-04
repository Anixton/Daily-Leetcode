// 2870 Minimum Number of Operations to Make Array Empty 

public class Solution {
    public int MinOperations(int[] nums) {
        Dictionary<int, int> occurrences=new Dictionary<int,int>();
        int maxOccurance=0;
        foreach (int element in nums)
        {
            if (occurrences.ContainsKey(element))
            {
                occurrences[element]++;
            }
            else
            {
                occurrences[element] = 1;
            }

            if(maxOccurance<occurrences[element]){maxOccurance=occurrences[element];}
        }

        // Ensure DP array is large enough
        int[] DP = new int[Math.Max(6, maxOccurance + 1)];  
        DP[0]=0;
        DP[1]=0;
        DP[2]=1;
        DP[3]=1;
        DP[4]=2;
        DP[5]=2;
        for(int i=6;i<=maxOccurance;i++)
        {
            DP[i]=Math.Min(DP[i-2],DP[i-3])+1;
        }

        int opCount=0;
        foreach (var kvp in occurrences)
        {
            if(kvp.Value<2){return -1;}
            opCount+=DP[kvp.Value];
        }

        return opCount;
    }
}