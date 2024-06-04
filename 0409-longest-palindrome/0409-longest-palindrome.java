class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> HM = new HashMap<Character,Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            if(HM.containsKey(s.charAt(i))) {
                HM.put(s.charAt(i), HM.get(s.charAt(i)) + 1);
            } else {
                HM.put(s.charAt(i), 1);
            }
        }
                       
        int result = 0;
        boolean hadOdd = false;
                       
        for (int value : HM.values()) {
            if(value % 2 == 0) {
                result += value;
            } else {
                if(!hadOdd) {
                    result += value;
                    hadOdd = true;
                } else {
                    result += value - 1;
                }
            }
        }
                       
        return result;
    }
}