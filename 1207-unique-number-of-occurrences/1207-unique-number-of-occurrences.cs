public class Solution {
    public bool UniqueOccurrences(int[] arr) {
        Dictionary<int,int> occurrenceCount = new Dictionary<int,int>();
        for(int i=0;i<arr.Length;i++)
        {
            if(occurrenceCount.ContainsKey(arr[i])){occurrenceCount[arr[i]]++;}
            else{occurrenceCount[arr[i]]=1;}
        }
        
        HashSet<int> uniqueCount = new HashSet<int>();
        
        foreach(var kvp in occurrenceCount)
        {
            if(uniqueCount.Contains(kvp.Value)){return false;}
            else{uniqueCount.Add(kvp.Value);}
        }
        
        return true;
    }
}