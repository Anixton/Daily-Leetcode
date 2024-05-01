class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean reversed = false;
        
        for(int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            
            if(!reversed && word.charAt(i) == ch) {
                sb.reverse();
                reversed = true;
            }
        }
        
        return sb.toString();
    }
}