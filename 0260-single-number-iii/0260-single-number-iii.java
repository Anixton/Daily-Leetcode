class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> countOfNums = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!countOfNums.containsKey(nums[i])) {
                countOfNums.put(nums[i], 1);
            } else {
                int count = countOfNums.get(nums[i]);
                countOfNums.put(nums[i], count + 1);
            }
        }
        
        int[] result = new int[2];
        int index=0;
        
        for (Map.Entry<Integer, Integer> entry : countOfNums.entrySet()) {
            if(entry.getValue()==1){
                result[index++]=entry.getKey();
                if(index==2) return result;
            }
        }
        
        return result;
    }
}