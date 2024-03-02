class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    
    public int minimumTotal(List<List<Integer>> triangle) {
        while (triangle.size()>result.size()) {
            List<Integer> newList = new ArrayList<>();
            result.add(newList);
        }

        result.get(0).add(triangle.get(0).get(0));
        
        for(int i=1;i<triangle.size();i++){
            result.get(i).add(triangle.get(i).get(0) + result.get(i - 1).get(0));
            
            for(int j=1;j<i;j++){
                result.get(i).add(Math.min(result.get(i - 1).get(j - 1), result.get(i - 1).get(j)) + triangle.get(i).get(j));
            }
            
            result.get(i).add(result.get(i - 1).get(i - 1) + triangle.get(i).get(i));
        }
        
        int minTotal=Integer.MAX_VALUE;
        
        for (int i = 0; i < result.get(result.size() - 1).size(); i++) {
            if (result.get(result.size() - 1).get(i) < minTotal) {
                minTotal = result.get(result.size() - 1).get(i);
            }
        }
        
        return minTotal;
    }
}