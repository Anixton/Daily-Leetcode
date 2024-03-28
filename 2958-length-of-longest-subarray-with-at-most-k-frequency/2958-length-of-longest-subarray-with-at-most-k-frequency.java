class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int startIndex = 0;
        int maxLen = 0;
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i])+1);
                
                if(map.get(nums[i])>k){
                    while(nums[startIndex] != nums[i]){
                        map.put(nums[startIndex],map.get(nums[startIndex])-1);
                        startIndex++;
                    }
                    
                    map.put(nums[startIndex],map.get(nums[startIndex])-1);
                    startIndex++;
                }
            }
            
            maxLen = Math.max(maxLen,i-startIndex+1);
        }
        
        return maxLen;
    }
}