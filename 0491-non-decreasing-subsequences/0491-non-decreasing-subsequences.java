class Solution {
    private int[] values;
    private Set<List<Integer>> result = new HashSet<>(); 
    
    private void helper(int index, List<Integer> path) {
        if (path.size() >= 2) {
            result.add(new ArrayList<>(path));
        }
        
        if (index == values.length) return;
        
        for (int i = index; i < values.length; i++) {
            if (path.size()!=0 && values[i] < path.get(path.size() - 1)) continue;
            path.add(values[i]);
            helper(i + 1, new ArrayList<>(path));
            path.remove(path.size() - 1);
        }
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        values = nums;
        helper(0, new ArrayList<>());
        
        return new ArrayList<>(result); 
    }
}