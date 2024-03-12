class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> leftMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> rightMap = new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            if(rightMap.containsKey(s.charAt(i))){
                rightMap.put(s.charAt(i),rightMap.get(s.charAt(i))+1);
            } else {
                rightMap.put(s.charAt(i),1);
            }
        }

        int result = 0;

        for(int i=0;i<s.length();i++){
            if(leftMap.containsKey(s.charAt(i))){
                leftMap.put(s.charAt(i),leftMap.get(s.charAt(i))+1);
            } else {
                leftMap.put(s.charAt(i),1);
            }
            
            rightMap.put(s.charAt(i),rightMap.get(s.charAt(i))-1);
            
            if(rightMap.get(s.charAt(i)) == 0){
                rightMap.remove(s.charAt(i));
            }
               
            if(rightMap.size() == leftMap.size()){
                result++;
            }
        }
               
        return result;
        
    }
}