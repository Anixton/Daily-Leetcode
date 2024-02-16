class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i],count.get(arr[i])+1);
            } else {
                count.put(arr[i],1);
            }
        }
        
        Integer[] sortedValuesArray = count.values().toArray(new Integer[0]);
        Arrays.sort(sortedValuesArray);
        
        int result = sortedValuesArray.length;
        int deleteCount=k;
        
        for(int i=0;i<sortedValuesArray.length;i++){
            if(sortedValuesArray[i]>deleteCount){
                return result;
            } else {
                deleteCount-=sortedValuesArray[i];
                result--;
            }
        }
        
        return result;        
    }
}