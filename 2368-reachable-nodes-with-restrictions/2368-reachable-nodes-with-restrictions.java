class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        HashSet<Integer> restrictedSet = new HashSet<>();
        for (int r : restricted) {
            restrictedSet.add(r);
        }

        Boolean[] visited = new Boolean[n];
        List<HashSet<Integer>> graph = new ArrayList<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
            visited[i] = false;
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            visited[node] = true;
            ans++;
            for (int next : graph.get(node)) {
                if (!visited[next] && !restrictedSet.contains(next)) {
                    queue.add(next);
                }
            }
        }

        return ans;
    }
}