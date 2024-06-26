class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int depth = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
                result = Math.max(result,depth);
            } else if(s.charAt(i)==')'){
                depth--;
            }
        }
        
        return result;
    }
}