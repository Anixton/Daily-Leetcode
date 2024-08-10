class Solution {
    
    private HashMap<String, Integer> distinctCount = new HashMap<String, Integer>();
    
    public String kthDistinct(String[] arr, int k) {
        
        for(String current : arr) {
            distinctCount.put(current, distinctCount.getOrDefault(current, 0) + 1);
        }
        
        int distinctStringCounter = 1;
        
        for(String current : arr) {
            if(distinctCount.get(current) == 1) {
                if(distinctStringCounter++ == k) {
                    return current;
                } 
            }
        }
        
        return "";
    }
}