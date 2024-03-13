class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minimumDifference = arr[1] - arr[0];
        
        for(int i=2;i<arr.length;i++){
            minimumDifference = Math.min(minimumDifference,arr[i]-arr[i-1]);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==minimumDifference){
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        
        return result;
    }
}