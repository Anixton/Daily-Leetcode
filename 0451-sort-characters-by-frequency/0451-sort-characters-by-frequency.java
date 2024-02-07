class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> occurrence = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(occurrence.containsKey(currentChar)){
                int currentCount = occurrence.get(currentChar);
                occurrence.put(currentChar, currentCount + 1);
            } else {
                occurrence.put(currentChar, 1);
            }
        }
        
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(occurrence.entrySet());
        Collections.sort(list,(o1,o2) -> o2.getValue().compareTo(o1.getValue()));
            
        char[] charArray = new char[s.length()];
        int index = 0;
    
        for(Map.Entry<Character,Integer> entry : list) {
            for(int i = 0; i < entry.getValue(); i++) {
                charArray[index++] = entry.getKey();
            }
        }
        
        return new String(charArray);
    }
}