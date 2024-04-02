class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> HM = new HashMap<Character,Character>();
        HashMap<Character,Character> secondHM = new HashMap<Character,Character>();
        
        for(int i=0;i<s.length();i++){
            if(HM.containsKey(s.charAt(i))){
                if(HM.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else {
                HM.put(s.charAt(i),t.charAt(i));
            }
            
            if(secondHM.containsKey(t.charAt(i))){
                if(secondHM.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            } else {
                secondHM.put(t.charAt(i),s.charAt(i));
            }
        }
        
        return true;
    }
}