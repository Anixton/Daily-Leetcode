class Solution {
    public void helper(List<List<Integer>> edgeList, List<Integer> visited, int current) {
        List<Integer> currentList = edgeList.get(current);
        
        for(Integer num : currentList) {
            if(!visited.contains(num)) {
                visited.add(num);
                helper(edgeList, visited, num);
            }
        }
    }
    
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> reversedGraph = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            reversedGraph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++) {
            reversedGraph.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i = 0; i < n; i++) {
            List<Integer> current = new ArrayList<>();
            helper(reversedGraph, current, i);
            Collections.sort(current);
            result.add(current);
        }
        
        return result;
    }
}