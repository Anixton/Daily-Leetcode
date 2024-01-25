class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] DP = new int[text1.length()][text2.length()];
        if(text1.charAt(0)==text2.charAt(0)){DP[0][0]=1;}
        else{DP[0][0]=0;}
        
        for(int i=1;i<DP[0].length;i++){
            if(text2.charAt(i)==text1.charAt(0)){
                DP[0][i]=1;
            }
            else{
                DP[0][i]=DP[0][i-1];
            }
        }
        
        for(int i=1;i<DP.length;i++){
            if(text1.charAt(i)==text2.charAt(0)){
                DP[i][0]=1;
            }
            else{
                DP[i][0]=DP[i-1][0];
            }
        }
        
        for(int row=1;row<DP.length;row++){
            for(int column=1;column<DP[0].length;column++){
                if(text1.charAt(row)==text2.charAt(column)){
                    DP[row][column]=DP[row-1][column-1]+1;
                }
                else{
                    DP[row][column]=Math.max(DP[row-1][column],DP[row][column-1]);
                }
            }
        }
        
        return DP[text1.length()-1][text2.length()-1];
        
    }
}