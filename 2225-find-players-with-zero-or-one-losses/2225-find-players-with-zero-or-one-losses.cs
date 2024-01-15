public class Solution {
    public IList<IList<int>> FindWinners(int[][] matches) {
        Dictionary<int,int> countOfLoss = new Dictionary<int,int>();
        for(int i=0;i<matches.Length;i++)
        {
            if(!countOfLoss.ContainsKey(matches[i][0]))
            {
                countOfLoss.Add(matches[i][0],0);
            }
            
            if(!countOfLoss.ContainsKey(matches[i][1]))
            {
                countOfLoss.Add(matches[i][1],1);
            }
            else
            {
                countOfLoss[matches[i][1]]++;
            }
        }
        
        List<List<int>> oneAndZeroLose = new List<List<int>>();
        List<int> oneLose = new List<int>();
        List<int> zeroLose = new List<int>();
        
        foreach(var kvp in countOfLoss)
        {
            if(kvp.Value==1){oneLose.Add(kvp.Key);}
            if(kvp.Value==0){zeroLose.Add(kvp.Key);}
        }
        
        oneLose.Sort();
        zeroLose.Sort();
        
        oneAndZeroLose.Add(zeroLose);
        oneAndZeroLose.Add(oneLose);
        
        return oneAndZeroLose.Cast<IList<int>>().ToList();
    }
}