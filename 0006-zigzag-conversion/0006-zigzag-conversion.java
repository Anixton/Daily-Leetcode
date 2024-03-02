class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        
        List<List<Character>> conversionList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            conversionList.add(new ArrayList<>());
        }
        
        boolean increase=true;
        int row=0;
        
        for(int i=0;i<s.length();i++){
            conversionList.get(row).add(s.charAt(i));
            
            if(increase){
                row++;
                
                if(row==numRows){
                    increase=false;
                    row=numRows-2;
                }
            } else {
                row--;
                
                if(row==-1){
                    increase=true;
                    row=1;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<conversionList.size();i++){
            for(int j=0;j<conversionList.get(i).size();j++){
                sb.append(conversionList.get(i).get(j));
            }
        }
        
        return sb.toString(); 
    }
}