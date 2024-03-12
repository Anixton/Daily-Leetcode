class Solution {
    private HashMap<Integer,HashSet<Integer>> map = new HashMap<>();

    public Solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],new HashSet<>());
            }
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        int size = map.get(target).size();
        Random  random = new Random();
        int index = random.nextInt(size);

        for (int i : map.get(target)) {
            if (index == 0) {
                return i;
            }
            index--;
        }

        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */