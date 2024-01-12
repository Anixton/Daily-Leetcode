public class Solution {
    public bool HalvesAreAlike(string s) {
        int firstHalfVowelCount=0;
        int secondHalfVowelCount=0;
        HashSet<char> vowelSet = new HashSet<char> 
        { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        
        for(int i=0;i<s.Length/2;i++)
        {
            if(vowelSet.Contains(s[i])){firstHalfVowelCount++;}
        }
        
        for(int i=s.Length/2;i<s.Length;i++)
        {
            if(vowelSet.Contains(s[i])){secondHalfVowelCount++;}
        }
        
        return firstHalfVowelCount==secondHalfVowelCount;
    }
}