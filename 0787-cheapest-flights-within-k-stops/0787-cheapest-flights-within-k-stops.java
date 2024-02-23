class Solution {

    static List<Pair<Integer, Integer>>[] graph;
    static Queue<int[]> minHeap;
    static int[][] dist;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        graph = new List[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int w = flight[2];
            graph[u].add(new Pair<>(v, w));
        }

        minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        dist = new int[graph.length][k + 2];
        for (int[] row : dist)
            Arrays.fill(row, Integer.MAX_VALUE);

        dist[src][k + 1] = 0;
        minHeap.offer(new int[]{dist[src][k + 1], src, k + 1});

        return helperDijkstra(src, dst, k);
    }


    private static int helperDijkstra(int src, int dst, int k) {

        while (!minHeap.isEmpty()) {
            int d = minHeap.peek()[0];
            int u = minHeap.peek()[1];
            int stops = minHeap.poll()[2];

            if (u == dst)
                return d;

            if (stops == 0)
                continue;


            for (Pair<Integer, Integer> pair : graph[u]) {
                int v = pair.getKey();
                int w = pair.getValue();
                if (d + w < dist[v][stops - 1]) {
                    dist[v][stops - 1] = d + w;
                    minHeap.offer(new int[]{dist[v][stops - 1], v, stops - 1});
                }
            }
        }

        return -1;
    }
}