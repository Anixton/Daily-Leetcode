class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    
    private void helper(int[] arr,int index,List<Integer> candidate){
        if(index>=arr.length) {
            result.add(candidate);
            return;
        }
        
        helper(arr,index+1,candidate);
        
        List<Integer> second = new ArrayList<>(candidate);
        second.add(arr[index]);
        
        helper(arr,index+1,second);        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums,0,new ArrayList<>());   
        return result;
    }
}