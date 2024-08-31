class Solution {

    private double[] probabilities;

    public double maxProbability(int nodeCount, int[][] edges, double[] successProbability, 
                                 int startNode, int endNode) {
        initializeProbabilities(nodeCount, startNode);

        for (int iteration = 0; iteration < nodeCount - 1; iteration++) {
            if (!updateProbabilities(edges, successProbability)) {
                break;
            }
        }

        return probabilities[endNode];
    }

    private void initializeProbabilities(int nodeCount, int startNode) {
        probabilities = new double[nodeCount];
        Arrays.fill(probabilities, 0.0);
        probabilities[startNode] = 1.0;
    }

    private boolean updateProbabilities(int[][] edges, double[] succProb) {
        boolean isUpdated = false;

        for (int i = 0; i < edges.length; i++) {
            int nodeA = edges[i][0];
            int nodeB = edges[i][1];
            double probability = succProb[i];

            if (probabilities[nodeA] * probability > probabilities[nodeB]) {
                probabilities[nodeB] = probabilities[nodeA] * probability;
                isUpdated = true;
            }

            if (probabilities[nodeB] * probability > probabilities[nodeA]) {
                probabilities[nodeA] = probabilities[nodeB] * probability;
                isUpdated = true;
            }
        }

        return isUpdated;
    }
}