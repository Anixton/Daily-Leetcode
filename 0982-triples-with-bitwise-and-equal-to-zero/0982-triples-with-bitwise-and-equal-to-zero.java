import java.util.HashMap;

class Solution {
    public int countTriplets(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(map.containsKey(nums[i] & nums[j])){
                    map.put(nums[i]&nums[j], map.get(nums[i] & nums[j])+1);
                }else{
                    map.put(nums[i]&nums[j], 1);
                }
            }
        }
        
        int result = 0;
        
        for(int i=0;i<nums.length;i++){
            for(int key : map.keySet()){
                if((key & nums[i]) == 0){
                    result += map.get(key);
                }
            }
        }
        
        return result;
    }
}