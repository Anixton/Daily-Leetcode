class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        
        for(int index = 0; index < target.length; index++) {
            targetMap.put(target[index], targetMap.getOrDefault(target[index], 0) + 1);
            arrMap.put(arr[index], arrMap.getOrDefault(arr[index], 0) + 1);
        }
        
        return arrMap.equals(targetMap);
    }
}