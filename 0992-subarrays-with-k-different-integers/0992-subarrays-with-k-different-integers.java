class Solution {
    public int subarraysWithKDistinct(int[] numbers, int distinctCount){
        return countSubarrays(numbers, distinctCount) - countSubarrays(numbers, distinctCount - 1);
    }

    public int countSubarrays(int[] numbers, int distinctCount) {
        int leftIndex = 0;
        int rightIndex = 0;
        int result = 0;
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        while(rightIndex < numbers.length){
            frequencyMap.put(numbers[rightIndex], frequencyMap.getOrDefault(numbers[rightIndex], 0) + 1);

            while (frequencyMap.size() > distinctCount) {
                frequencyMap.put(numbers[leftIndex], frequencyMap.get(numbers[leftIndex]) - 1);

                if (frequencyMap.get(numbers[leftIndex]) == 0) {
                    frequencyMap.remove(numbers[leftIndex]);
                }
                
                leftIndex++;
            }

            result += (rightIndex - leftIndex + 1);
            rightIndex++;
        }
        return result;  
    }
}