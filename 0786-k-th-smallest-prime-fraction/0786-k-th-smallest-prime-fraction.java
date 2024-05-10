class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Double> PQ = new PriorityQueue<>();
        int[] result = new int[2];
        
        for(int firstIndex = 0; firstIndex < arr.length; firstIndex++) {
            for(int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
                double current = ((double) arr[firstIndex] / arr[secondIndex]);
                PQ.add(current);
            }
        }
        
        while(k != 1) {
            PQ.poll();
            k--;
        }
        
        double target = PQ.poll();
        
        for(int firstIndex = 0; firstIndex < arr.length; firstIndex++) {
            for(int secondIndex = firstIndex + 1; secondIndex < arr.length; secondIndex++) {
                double current = ((double) arr[firstIndex] / arr[secondIndex]);
                if(current == target) {
                    result[0] = arr[firstIndex];
                    result[1] = arr[secondIndex];
                }
            }
        }
        
        return result;
    }
}