class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        Queue<Integer> myQ = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            List<Integer> myList = new ArrayList<>();
            adjacencyList.add(myList);
            visited[i] = false;
        }
        
        for(int i = 0; i < edges.length; i++) {
            adjacencyList.get(edges[i][0]).add(edges[i][1]);
            adjacencyList.get(edges[i][1]).add(edges[i][0]);
        }        
        
        for(int i = 0; i < adjacencyList.get(source).size(); i++) {
            myQ.offer(adjacencyList.get(source).get(i));
        }
        
        visited[source] = true;
        
        while(!myQ.isEmpty()) {
            int current = myQ.poll();
            visited[current] = true;
            
            if(current == destination) return true;
            
            for(int i = 0; i < adjacencyList.get(current).size(); i++) {
                if(!visited[adjacencyList.get(current).get(i)]) {
                    myQ.offer(adjacencyList.get(current).get(i));
                    visited[adjacencyList.get(current).get(i)] = true;
                }
            }
        }
        
        return visited[destination];
    }
}
