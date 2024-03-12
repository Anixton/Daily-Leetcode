class Solution {
    public int maxProduct(String[] words) {
        int[][] alph = new int[words.length][26];
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                alph[i][words[i].charAt(j)-'a']++;
            }
        }
        
        int result = 0;
        
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()*words[j].length()>result){
                    boolean different = true;
                    for(int index=0;index<26;index++){
                        if(alph[i][index]!=0 && alph[j][index]!=0){
                            different = false;
                            break;
                        }
                    }
                    
                    if(different){
                        result = words[i].length()*words[j].length();
                    }
                }
            }
        }
        
        return result;
    }
}