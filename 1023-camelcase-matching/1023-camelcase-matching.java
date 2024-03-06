import java.util.List;

class Solution {
    private boolean helper(String query, String pattern) {
        int patternPointer=0;
        int queryPointer=0;
        
        while(queryPointer<query.length() && patternPointer<pattern.length()){
            if(query.charAt(queryPointer) != pattern.charAt(patternPointer)){
                if (!Character.isUpperCase(query.charAt(queryPointer))) {
                    queryPointer++;
                    continue;
                } else {
                    return false;
                }
            }
            
            while(query.length()>queryPointer && pattern.length()>patternPointer && 
                  query.charAt(queryPointer) == pattern.charAt(patternPointer)) {
                queryPointer++;
                patternPointer++;
            }
        }
        
        while(queryPointer<query.length()){
            if(Character.isUpperCase(query.charAt(queryPointer))) return false;
            
            queryPointer++;
        }
        
        return patternPointer==pattern.length();        
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for (String query : queries) {
            res.add(helper(query, pattern));
        }
       
        return res;
    }
}