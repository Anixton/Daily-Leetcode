class Solution {
    public long maximumImportance(int n, int[][] roads) {
        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < roads.length; i++) {
            if(HM.containsKey(roads[i][0])){
                HM.put(roads[i][0], HM.get(roads[i][0]) + 1);
            } else {
                HM.put(roads[i][0], 1);
            }
            
            if(HM.containsKey(roads[i][1])){
                 HM.put(roads[i][1], HM.get(roads[i][1]) + 1);
            } else {
                 HM.put(roads[i][1], 1);
            }
        }
        
        List<Integer> values = new ArrayList<>();
        
        for(Integer value : HM.values()) {
            values.add(value);
        }
        
        Collections.sort(values, Collections.reverseOrder());
        
        long result = 0;
        int current = n;
        
        for(int i = 0; i < values.size(); i++) {
            result += (long)values.get(i) * current;
            current--;
        }
       
        
        return result;
    }
}