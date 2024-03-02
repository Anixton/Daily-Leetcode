class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    private void helper(int[] candidates,int index,int sum,List<Integer> path,int target){
        if(sum==target){
            if(!result.contains(path)){
                result.add(path);
            }
            return;
        }
        
        if(sum>target) return;
        if(index>=candidates.length) return;
        
        List<Integer> alternative = new ArrayList<>(path);
        int forward=1;
        while(index+forward < candidates.length &&candidates[index]==candidates[index+forward]) {
            forward++;
        }
        
        helper(candidates,index+forward,sum,alternative,target);
        
        path.add(candidates[index]);
        helper(candidates,index+1,sum+candidates[index],path,target);
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        
        helper(candidates,0,0,path,target);
        
        return result;
    }
}