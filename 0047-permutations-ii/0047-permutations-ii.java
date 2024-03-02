class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    private void helper(List<Integer> possibleValues,List<Integer> currentPath ) {
        if(possibleValues.size()==0){
            if(!result.contains(currentPath)){
                result.add(currentPath);
            }
            
            return;
        }
        
        for(int i=0;i<possibleValues.size();i++){
            int value=possibleValues.get(i);
            List<Integer> nextPossibleValues = new ArrayList<>(possibleValues);
            List<Integer> nextCurrentPath = new ArrayList<>(currentPath);
            nextPossibleValues.remove(Integer.valueOf(value));
            nextCurrentPath.add(value);
            helper(nextPossibleValues,nextCurrentPath);
        }
    }  
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> possibleValues = Arrays.asList(integerArray);
        List<Integer> path = new ArrayList<>();
        
        helper(possibleValues,path);
        
        return result;
    }
}