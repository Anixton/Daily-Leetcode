class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int firstWrongIndex = -1;
        int secondWrongIndex = -1;
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(firstWrongIndex == -1){
                    firstWrongIndex = i;
                }else if(secondWrongIndex == -1){
                    secondWrongIndex = i;
                }else{
                    return false;
                }
            }
        }

        if(firstWrongIndex == -1 && secondWrongIndex == -1){
            return true;
        }

        if(firstWrongIndex != -1 && secondWrongIndex != -1){
            return s1.charAt(firstWrongIndex) == s2.charAt(secondWrongIndex) && s1.charAt(secondWrongIndex) == s2.charAt(firstWrongIndex);
        }

        return false;
    }
}