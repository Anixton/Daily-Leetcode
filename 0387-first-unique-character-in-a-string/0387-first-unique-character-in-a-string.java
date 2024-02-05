class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(dictionary.containsKey(s.charAt(i))){
                int occurrenceCount = dictionary.get(s.charAt(i));
                dictionary.put(s.charAt(i), occurrenceCount + 1);
            } else {
                dictionary.put(s.charAt(i),1);
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(dictionary.get(s.charAt(i)) == 1){
                return i;
            }
        }    
        
        return -1;
    }
}
