class KthLargest {

    private List<Integer> sortedList;
    private final int returnIndex;
    
    public KthLargest(int k, int[] nums) {
        sortedList = new ArrayList<>();
        returnIndex = k - 1;
        
        Arrays.sort(nums);
        for(int num : nums) {
            sortedList.add(num);    
        }
        
        Collections.reverse(sortedList);
    }
    
    public int add(int val) {
        int left = 0;
        int right = sortedList.size() - 1;
        int indexToInsert = calculateIndexToInsert(left, right, val);
        
        sortedList.add(indexToInsert, val);
        return sortedList.get(returnIndex);
    }
    
    private int calculateIndexToInsert(int left, int right, int valueToInsert) {
        if (left >= right) {
            if (sortedList.isEmpty() || sortedList.get(left) < valueToInsert) {
                return left;
            } else {
                return left + 1;
            }
        }

        int middle = (left + right) / 2;
        int currentComparisonValue = sortedList.get(middle);

        if (currentComparisonValue == valueToInsert) {
            return middle;
        } else if (currentComparisonValue < valueToInsert) {
            return calculateIndexToInsert(left, middle - 1, valueToInsert);
        } else {
            return calculateIndexToInsert(middle + 1, right, valueToInsert);
        }
    }
}
