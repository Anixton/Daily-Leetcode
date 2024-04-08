class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int pivot = -1;
        
        for(int i=0;i<nums.size();i++){
            int left = nums.get(i);
            int right = nums.get((i+1)%nums.size());
            
            if(left>right){
                if(pivot == -1){
                    pivot = (i+1)%nums.size();
                } else {
                    return -1;
                }
            }
        }
        
        return pivot == -1 ? 0 : (nums.size()-pivot)%nums.size();
    }
}