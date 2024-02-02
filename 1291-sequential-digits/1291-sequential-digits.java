class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        
        int lowDigitCount = String.valueOf(low).length();
        int highDigitCount = String.valueOf(high).length();
        
        for(int k=lowDigitCount;k<=highDigitCount;k++){
            for(int i = 1; i <= 10-k; i++){
                int current = i;
                for(int j = 1; j < k; j++){
                    current*=10;
                    current+=(i+j);
                }
               if (current >= low && current <= high) {
                    result.add(current);
                }
            }
        }
        
        return result;
    }
}