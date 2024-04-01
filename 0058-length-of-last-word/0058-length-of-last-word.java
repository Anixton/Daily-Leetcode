class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int index = 0;
        
        while(index < s.length()){
            if(s.charAt(index)==' '){
                index++;
            }
            else {
                result = 1;
                index++;
                
                while(index<s.length() && s.charAt(index)!=' '){
                    result++;
                    index++;
                }
            }
        }
        
        return result;
    }
}