class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    private void helper(List<Integer> valueOptions, List<Integer> candidate){
        if(valueOptions.size()==0){
            result.add(new ArrayList<>(candidate));
            return;
        }
        for(int i=0;i<valueOptions.size();i++){
            int currentValue = valueOptions.get(i);
            candidate.add(currentValue);
            valueOptions.remove(Integer.valueOf(currentValue)); 
            helper(valueOptions, candidate);
            candidate.remove(candidate.size() - 1); 
            valueOptions.add(i, currentValue);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        helper(numsList, new ArrayList<>());
        return result;
    }
}