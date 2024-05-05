class Solution {
    private int result = 0;
    
    public int numberOfSubstrings(String s) {
        List<Integer> aIndex = new ArrayList<>();
        List<Integer> bIndex = new ArrayList<>();
        List<Integer> cIndex = new ArrayList<>();
        
        int firstIndex = 0;
        int secondIndex = 0;
        int thirdIndex = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                aIndex.add(i);
            } else if(s.charAt(i) == 'b') {
                bIndex.add(i);
            } else {
                cIndex.add(i);
            }
        }
        
        
        for(int i = 0; i < s.length(); i++) {
            if(aIndex.size() == 0 || bIndex.size() == 0 || cIndex.size() == 0 ||
               i > aIndex.get(aIndex.size() - 1) || 
               i > bIndex.get(bIndex.size() - 1) ||
               i > cIndex.get(cIndex.size() - 1)) {
                break;
            }
            
            
            int endingIndex = i;
            
            while(firstIndex < aIndex.size()){
                if(aIndex.get(firstIndex) >= i){
                    endingIndex = Math.max(aIndex.get(firstIndex),endingIndex);
                    break;
                }
                
                firstIndex++;
            }
            
            while(secondIndex < bIndex.size()){
                if(bIndex.get(secondIndex) >= i){
                    endingIndex = Math.max(bIndex.get(secondIndex),endingIndex);
                    break;
                }
                
                secondIndex++;
            }
            
            while(thirdIndex < cIndex.size()){
                if(cIndex.get(thirdIndex) >= i){
                    endingIndex = Math.max(cIndex.get(thirdIndex),endingIndex);
                    break;
                }
                
                thirdIndex++;
            }
            
            result += s.length() - endingIndex;
        }
        
        return result;
    }
}