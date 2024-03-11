class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> storedValues = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(storedValues.containsKey(s.charAt(i))){
                storedValues.put(s.charAt(i),storedValues.get(s.charAt(i))+1);
            } else {
                storedValues.put(s.charAt(i),1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<order.length();i++){
            if(storedValues.containsKey(order.charAt(i))){
                for(int j=0;j<storedValues.get(order.charAt(i));j++){
                    sb.append(order.charAt(i));
                }
                storedValues.remove(order.charAt(i));
            }
        }
        
        for(Character key : storedValues.keySet()){
            for(int k=0;k<storedValues.get(key);k++){
                sb.append(key);
            }
        }
        
        return sb.toString();
    }
}