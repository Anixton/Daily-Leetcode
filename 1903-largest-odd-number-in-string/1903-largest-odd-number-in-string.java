class Solution {
    public String largestOddNumber(String num) {
        int endIndex = -1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i) == '1' ||
               num.charAt(i) == '3' ||
               num.charAt(i) == '5' ||
               num.charAt(i) == '7' ||
               num.charAt(i) == '9')
            {
                endIndex = i;
                break;
            }
        }
        
        if(endIndex == -1) return "";
        
        return num.substring(0,endIndex+1);
    }
}