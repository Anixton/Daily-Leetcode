class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> possibleChars = new HashSet<Character>();
        
        for(int i=0;i<allowed.length();i++){
            possibleChars.add(allowed.charAt(i));
        }
        
        int result = 0;
        
        for(int i = 0; i<words.length;i++){
            boolean possibleResult = true;
            for(int j=0;j<words[i].length();j++){
                if(!possibleChars.contains(words[i].charAt(j))){
                    possibleResult = false;
                    break;
                }
            }
            
            if(possibleResult) result++;
        }
        
        return result;
    }
}