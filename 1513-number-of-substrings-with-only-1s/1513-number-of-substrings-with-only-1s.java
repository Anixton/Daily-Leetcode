class Solution {
    private long MOD = 1000000007;
    
    public int numSub(String s) {
        long result = 0;
        long streak = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                streak++;
                result+=streak;
                result%=MOD;
            } else {
                streak = 0;
            }
        }
        
        return (int) result;
    }
}