class Solution {
    public List<String> commonChars(String[] words) {
        int[] charOccurrence = new int[26];
        for (int i = 0; i < 26; i++) {
            charOccurrence[i] = Integer.MAX_VALUE; 
        }
        
        for (String word : words) {
            int[] current = new int[26];
            for (int j = 0; j < word.length(); j++) {
                current[word.charAt(j) - 'a']++;
            }
            
            for (int index = 0; index < 26; index++) {
                charOccurrence[index] = Math.min(charOccurrence[index], current[index]);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            for (int counter = 0; counter < charOccurrence[i]; counter++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        
        return result;
    }
}
