class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeroCount=0;
        int oneCount=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        
        String result = "";
        
        while(oneCount>1){
            result+="1";
            oneCount--;
        }
        
        while(zeroCount>0){
            result+="0";
            zeroCount--;
        }
        
        result+="1";
        
        return result;
    }
}