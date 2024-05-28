class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();  
        int res = 0;         
        int win = 0;         
        int l = 0;           

        for(int r = 0; r < n; r++) {
            win += Math.abs(s.charAt(r) - t.charAt(r));
            
            while(win > maxCost) {
                win -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            
            res = Math.max(res, r - l + 1);
        }
        
        return res;  
    }
}