class Solution {
    public int kInversePairs(int n, int k) {
        int[][] DP = new int[n+2][k+2];
        for(int i=0;i<DP.length;i++){
            DP[i][0]=1;
        }
        DP[1][1]=0;
        
       
            
        for(int i=2;i<=n;i++){
            for(int j=1;j<=k;j++){
               for(int h=Math.min(j,i-1);h>=0;h--){
                   DP[i][j] = (DP[i][j] + DP[i - 1][j - h]) % 1000000007;
               }
            }
        }
        
        return DP[n][k];
            
            
            
        //DP[i][k]=DP[i-1][k]+DP[i-1][k-1]+DP[i-1][k-2].....+DP[i-1][0]
    }
}

 /*DP[2][1]=DP[1][1]+DP[1][0]
            
        DP[3][1]=DP[2][1]+DP[2][0]+DP[2][-1]
            
        DP[4][1]=DP[3][1]+DP[3][0]+0000
            
        DP[4][2]=DP[3][2]+DP[3][1]+DP[3][0]
            
        DP[4][4]=DP[3][4]+DP[3][3]
        
        DP[6][4]=DP[5][4]+DP[5][3]+DP[5][2]+DP[5][1]+DP[5][0]
        
        Math.min(n,k)
        */