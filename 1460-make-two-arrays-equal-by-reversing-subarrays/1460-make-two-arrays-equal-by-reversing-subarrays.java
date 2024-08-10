class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        
        for(int index = 0; index < target.length; index++) {
            if(targetMap.containsKey(target[index])) {
                targetMap.put(target[index], targetMap.get(target[index]) + 1);
            } else {
                targetMap.put(target[index], 1);
            }
            
            if(arrMap.containsKey(arr[index])) {
                arrMap.put(arr[index], arrMap.get(arr[index]) + 1);
            } else {
                arrMap.put(arr[index], 1);
            }
        }
        
        return arrMap.equals(targetMap);
    }
}