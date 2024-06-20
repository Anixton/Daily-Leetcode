class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        int low = 1;
        int high = (position[position.length - 1] - position[0]) / (m - 1);
        int answer = 1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(canWePlace(position, mid, m)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return answer;
    }
    
    private boolean canWePlace(int[] arr, int dist, int cows) {
        int countCows = 1;
        int last = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            
            if(countCows >= cows) {
                return true;
            }
        }
        
        return false;
    }
}