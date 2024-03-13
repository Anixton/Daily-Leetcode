class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int difference = 0;
            for(int j=0;j<dictionary.length;j++){
                for(int k=0;k<queries[i].length();k++){
                    if(queries[i].charAt(k) != dictionary[j].charAt(k)){
                        difference++;
                        if(difference>2) break;
                    }
                }
                
                if(difference<=2){
                    result.add(queries[i]);
                    break;
                }
                difference = 0;
            }
        }
        
        return result;
    }
}