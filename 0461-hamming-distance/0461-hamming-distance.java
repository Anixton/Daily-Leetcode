class Solution {
    public int hammingDistance(int x, int y) {
        int product = x ^ y;
        String binaryString = Integer.toBinaryString(product);
        
        int result=0;
        
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i)=='1'){
                result++;
            }
        }
        
        return result;
    }
}