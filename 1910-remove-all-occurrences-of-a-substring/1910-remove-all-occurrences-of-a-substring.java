class Solution {
    public String removeOccurrences(String s, String part) {
        boolean foundPart = true;
        StringBuilder sb = new StringBuilder(s);
        
        while(foundPart){
            foundPart = false;
            int index = 0;
            
            while(index<=sb.length()-part.length()){
                if(sb.charAt(index) != part.charAt(0)){
                    index++;
                    continue;
                }
                
                boolean next = false;
                
                for(int i=1;i<part.length() && index+i<sb.length();i++){
                    if(sb.charAt(index+i) != part.charAt(i)){
                        index++;
                        next = true;
                        break;
                    }
                }
                
                if(!next){
                    foundPart = true;
                    sb.delete(index,index+part.length());
                    break;
                }
            }
        }
        
        return sb.toString();
    }
}