class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0) return new int[0];
        
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        int[] result = new int[changed.length/2];
        int index = 0;
        
        for(int i=0;i<changed.length;i++){
            if(count.containsKey(changed[i])){
                count.put(changed[i],count.get(changed[i])+1);
            }else{
                count.put(changed[i],1);
            }
        }
        
        Arrays.sort(changed);
        int i=0;
        
        while(index!=result.length && i<changed.length){
            if(count.get(changed[i]) <= 0){
                i++;
                continue;
            }
            
            if(changed[i]==0 && count.get(changed[i])%2==1){
                return new int[0];
            } else if(count.containsKey(changed[i]*2) && count.get(changed[i]*2) > 0){
                count.put(changed[i],count.get(changed[i])-1);
                result[index++] = changed[i];  
                count.put(changed[i]*2,count.get(changed[i]*2)-1);
            } else {
                return new int[0];
            } 
            
            i++;
        }
        
        return result;
    }
}