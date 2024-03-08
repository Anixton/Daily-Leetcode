class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        
        int result = 0;
        int maxFreq = 0;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                result = entry.getValue();
            } else if (entry.getValue() == maxFreq){
                result += maxFreq;
            } else {
                continue;
            }
        }
        
        return result;
    }
}