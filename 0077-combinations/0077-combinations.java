class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    private void helper(int num,int upperLimit,int sizeLimit,List<Integer> currentPath){
        if(currentPath.size()==sizeLimit){
            result.add(currentPath);
            return;
        } else if(num>upperLimit){
            return;
        } else {
            List<Integer> alternative = new ArrayList<>(currentPath);
            helper(num+1,upperLimit,sizeLimit,alternative);
            
            currentPath.add(num);
            helper(num+1,upperLimit,sizeLimit,currentPath);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        helper(1,n,k,path);
        
        return result;
    }
}