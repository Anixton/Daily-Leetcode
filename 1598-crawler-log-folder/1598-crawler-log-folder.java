class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        
        for(int i = 0; i < logs.length; i++) {
            if(logs[i].charAt(0) != '.') {
                depth++;
            } else if(logs[i].charAt(1) == '.' && depth > 0) {
                depth--;
            } else {
                continue;
            }
        }
        
        return Math.max(depth, 0);
    }
}