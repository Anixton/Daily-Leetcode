class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dictSet = new HashSet<>(dictionary);
        int index = 0;
        StringBuilder result = new StringBuilder();
        
        while(index < sentence.length()) {
            int rightIndex = index + 1;
            boolean addedString = false;
            
            while(rightIndex < sentence.length() && sentence.charAt(rightIndex) != ' '){
                String substring = sentence.substring(index, rightIndex);
                
                if(dictSet.contains(substring) && !addedString){
                    result.append(" ");
                    result.append(substring);
                    addedString = true;
                }
                
                rightIndex++;
            }
            
            if(!addedString){
                String substring = sentence.substring(index, rightIndex);
                result.append(" ");
                result.append(substring);
            }
            
            while(index < sentence.length() && sentence.charAt(index) != ' '){
                index++;
            }
            
            index++;
        }
        
        return result.toString().substring(1);
    }
}