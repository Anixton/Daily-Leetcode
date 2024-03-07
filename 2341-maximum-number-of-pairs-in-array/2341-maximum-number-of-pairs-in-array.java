class Solution {
    public int[] numberOfPairs(int[] nums) {
        int deletionCount = 0;
        int leftOverCount = 0;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        for(int value : map.values()){
            if(value % 2 == 1){
                leftOverCount++;
            }

            deletionCount += (value / 2);   
        }

        int[] result = new int[2];
        result[0] = deletionCount;
        result[1] = leftOverCount;

        return result;
    }
}