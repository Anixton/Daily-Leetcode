class Solution {
    public int minSteps(String s, String t) {
        int[] characterCount = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            characterCount[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++) {
            characterCount[t.charAt(i) - 'a']--;
        }
        
        int result = 0;
        
        for(int i = 0; i < characterCount.length; i++) {
            result += Math.abs(characterCount[i]);
        }
        
        return result;
    }
}