class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer,Integer> HM = new HashMap<>();
        
        for(int i = 0; i < score.length; i++) {
            PQ.add(score[i]);
        }
        
        int rank = 1;
        
        while(!PQ.isEmpty()){
            HM.put(PQ.poll(), rank++);
        }
        
        String[] result = new String[score.length];
        
        for(int i = 0; i < score.length; i++) {
            if(HM.get(score[i]) == 1) {
                result[i] = "Gold Medal";
            } else if(HM.get(score[i]) == 2) {
                result[i] = "Silver Medal";
            } else if(HM.get(score[i]) == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = ""+HM.get(score[i]);
            }
        }
        
        return result;
    }
}