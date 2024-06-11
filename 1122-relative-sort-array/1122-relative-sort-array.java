class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < arr1.length; i++) {
            if(HM.containsKey(arr1[i])) {
                HM.put(arr1[i], HM.get(arr1[i]) + 1);
            } else {
                HM.put(arr1[i], 1);
            }
        }
        
        int[] result = new int[arr1.length];
        int index = 0;
        
        for(int i = 0; i < arr2.length; i++) {
            for(int count = 0; count < HM.get(arr2[i]); count++) {
                result[index++] = arr2[i];
            }
            
            HM.put(arr2[i], 0);
        }
        
        Arrays.sort(arr1);
        
        for(int i = 0; i < arr1.length; i++) {
            if(HM.get(arr1[i]) > 0) {
                for(int count = 0; count < HM.get(arr1[i]); count++) {
                    result[index++] = arr1[i];
                }
                HM.put(arr1[i], 0);
            } 
        }
        
        return result;
    }
}