class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int[][] DP=new int[matrix.length+1][matrix[0].length+1];
        
        for(int row=1;row<=matrix.length;row++){
            for(int col=1;col<=matrix[0].length;col++){
                DP[row][col]=DP[row][col-1]+DP[row-1][col]-DP[row-1][col-1]+matrix[row-1][col-1];
            }
        }
        
        int result=0;
        
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                for(int i=row+1;i<=matrix.length;i++){
                    for(int j=col+1;j<=matrix[0].length;j++){
                        int sum=DP[i][j]-DP[i][col]-DP[row][j]+DP[row][col];
                        if(sum==target){
                            result++;
                        }
                    }
                }
            }
        }

        return result;
    }
}