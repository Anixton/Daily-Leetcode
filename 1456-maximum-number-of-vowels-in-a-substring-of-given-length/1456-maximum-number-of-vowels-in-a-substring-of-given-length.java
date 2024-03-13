class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');   
        
        int currentVowelCount = 0;
        
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                currentVowelCount++;
            }
        }
        
        int maxVowelCount = currentVowelCount;
        
        for(int index = k;index<s.length();index++){
            if(set.contains(s.charAt(index))){
                currentVowelCount++;
            }
            
            if(set.contains(s.charAt(index-k))){
                currentVowelCount--;
            }
            
            maxVowelCount = Math.max(maxVowelCount,currentVowelCount);
        }
        
        return maxVowelCount;
    }
}