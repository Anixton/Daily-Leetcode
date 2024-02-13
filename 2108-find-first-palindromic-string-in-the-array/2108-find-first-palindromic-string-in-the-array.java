class Solution {
    public boolean isStringPalindrome(String candidate) {
        if(candidate.length() == 1){
            return true;
        }

        int startIndex = 0;
        int endIndex = candidate.length() - 1;
        
        while(startIndex < endIndex){
            if(candidate.charAt(startIndex) != candidate.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }
    
    public String firstPalindrome(String[] words) {
        String firstPalindrome = "";

        for(int index = 0; index < words.length; index++){
            if(isStringPalindrome(words[index])){
                firstPalindrome = words[index];
                break;
            }
        }

        return firstPalindrome;
    }
}