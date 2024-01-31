import java.util.HashMap;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        int[] result = new int[temperatures.length];
        result[temperatures.length-1]=0;
        dictionary.put(temperatures[temperatures.length-1],temperatures.length-1);
        
        for(int i=temperatures.length-2;i>=0;i--){
            if(temperatures[i+1]>temperatures[i]){
                result[i]=1;
            }
            else{
                result[i] = Integer.MAX_VALUE;
                for (int j = temperatures[i]+1; j <= 100; j++) {
                    if (dictionary.containsKey(j) && dictionary.get(j)-i < result[i]) {
                        result[i] = dictionary.get(j)-i;
                    }
                }
                if (result[i] == Integer.MAX_VALUE) {
                    result[i] = 0;
                }
            }
          
            dictionary.put(temperatures[i],i);
       }
                
         return result;
   }
}