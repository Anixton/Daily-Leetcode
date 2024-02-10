class Solution {
    private int palindromeCount=0;
    private String candidate;
    
    private void checkPalindrome(int middle){
        int left=middle;
        int right=middle;
        
        while(left>=0 && right<candidate.length()){
            if(candidate.charAt(left) == candidate.charAt(right)) {
                palindromeCount++;
                left--;
                right++;
            } else {
                break;
            }
        }
        
        if(middle-1>=0 && candidate.charAt(middle - 1) == candidate.charAt(middle)) {
            left=middle-1;
            right=middle;
            
            while(left>=0 && right<candidate.length()){
                if(candidate.charAt(left) == candidate.charAt(right)) {
                    palindromeCount++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }   
    }
    
    public int countSubstrings(String s) {
        candidate=s;
        for(int i=0;i<s.length();i++){
            checkPalindrome(i);
        }
        return palindromeCount;
    }
}