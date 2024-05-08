class Solution {
    public int minAddToMakeValid(String s) {
        int result = 0;
        int current = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                current++;
            } else if(s.charAt(i) == ')'){
                current--;
            } else {
                continue;
            }
            
            if(current < 0) {
                result += (-current);
                current = 0;
            }
        }
        
        result += Math.abs(current);
        return result;
    }
}