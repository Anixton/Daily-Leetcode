class Solution {
    public String removeDigit(String number, char digit) {
        String result = " ";
        
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                StringBuilder sb = new StringBuilder();
                sb.append(number.substring(0, i));
                sb.append(number.substring(i + 1));
                
                if(result.equals(" ") || result.compareTo(sb.toString()) < 0) {
                    result = sb.toString();
                }
            }
        }
        
        return result;
    }
}