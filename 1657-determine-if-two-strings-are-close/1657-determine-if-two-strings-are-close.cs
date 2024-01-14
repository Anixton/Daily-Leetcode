public class Solution {
    public bool CloseStrings(string word1, string word2) {
        if(word1.Length!=word2.Length){return false;}
        
        Dictionary<char,int> firstOccurrenceCount = new Dictionary<char,int>();
        Dictionary<char,int> secondOccurrenceCount = new Dictionary<char,int>();
        
        // word1.Length = word2.Length
        for(int i=0;i<word1.Length;i++)
        {
            if(firstOccurrenceCount.ContainsKey(word1[i]))
            {
                firstOccurrenceCount[word1[i]]++;
            }
            else
            {
                firstOccurrenceCount[word1[i]]=1;
            }
            
            if(secondOccurrenceCount.ContainsKey(word2[i]))
            {
                secondOccurrenceCount[word2[i]]++;
            }
            else
            {
                secondOccurrenceCount[word2[i]]=1;
            }
        }

        Dictionary<int,int> countDictionary1 = new Dictionary<int,int>();
        Dictionary<int,int> countDictionary2 = new Dictionary<int,int>();
        
        HashSet<int> firstCharSet = new HashSet<int>();
        HashSet<int> secondCharSet = new HashSet<int>();
        
        foreach(var kvp in firstOccurrenceCount)
        {
            firstCharSet.Add(kvp.Key);
            if(countDictionary1.ContainsKey(kvp.Value)){countDictionary1[kvp.Value]++;}
            else
            {
                countDictionary1[kvp.Value]=1;
            }
        }
        
        foreach(var kvp in secondOccurrenceCount)
        {
            secondCharSet.Add(kvp.Key);
            if(countDictionary2.ContainsKey(kvp.Value)){countDictionary2[kvp.Value]++;}
            else
            {
                countDictionary2[kvp.Value]=1;
            }
        }
        
        foreach(var kvp in countDictionary1)
        {
            if(!countDictionary2.ContainsKey(kvp.Key)){return false;}
            if(kvp.Value!=countDictionary2[kvp.Key]){return false;}
        }
        
        return(firstCharSet.SetEquals(secondCharSet));
    }
}