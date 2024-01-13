public class Solution {
    public int MinSteps(string s, string t) {
        Dictionary<char,int> targetString=new Dictionary<char,int>();
        Dictionary<char,int> currentString=new Dictionary<char,int>();
        int replaceCount=0;
        
        // s.Length == t.Length
        for(int i=0;i<s.Length;i++)
        {
            if(targetString.ContainsKey(s[i]))
            {
                targetString[s[i]]++;
            }
            else
            {
                targetString[s[i]]=1;
            }
            
            if(currentString.ContainsKey(t[i]))
            {
                currentString[t[i]]++;
            }
            else
            {
                currentString[t[i]]=1;
            }
        }
        
        foreach(var kvp in targetString)
        {
            if(currentString.ContainsKey(kvp.Key))
            {
                replaceCount+=Math.Max(kvp.Value-currentString[kvp.Key],0);
            }
            else
            {
                replaceCount+=kvp.Value;
            }
        }
        
        return replaceCount;
    }
}