class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
        int result = 0;
        
        for(int i = 0; i < time.length; i++) {
            int current = time[i] % 60;
            
            if(HM.containsKey((60 - current) % 60)) {
                result += HM.get((60 - current) % 60);
            }
            
            if(HM.containsKey(current)) {
                HM.put(current , HM.get(current) + 1);
            } else {
                HM.put(current , 1);
            }
        }
        
        return result;
    }
}