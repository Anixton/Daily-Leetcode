class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int count = 0;
        int maximumLength = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            } else {
                count--;
            }
            
            if(map.containsKey(count)){
                maximumLength = Math.max(maximumLength , i-map.get(count));
            } else {
                map.put(count,i);
            }
        }
        
        return maximumLength;
    }
}