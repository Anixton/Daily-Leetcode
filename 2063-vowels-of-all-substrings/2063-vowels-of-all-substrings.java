class Solution {
    public long countVowels(String word) {
        long result = 0;
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        for(int i=0;i<word.length();i++){
            if(!vowels.contains(word.charAt(i))){
                continue;
            }
            
            long first = i+1;
            long second = word.length()-i;
            
            result += first*second;
        }
        
        return result;
    }
}