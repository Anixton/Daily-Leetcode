public class Solution {
    public int MinFallingPathSum(int[][] matrix) {
        int[,] DP = new int[matrix.Length,matrix[0].Length];
        for(int i=0;i<matrix[0].Length;i++)
        {
            DP[0, i] = matrix[0][i];
        }
        
        for(int i=1;i<matrix.Length;i++)
        {
            DP[i,0]=Math.Min(DP[i-1,0],DP[i-1,1]);
            DP[i,0]+=matrix[i][0];
            for(int j=1;j<matrix[0].Length-1;j++)
            {
                DP[i,j]=Math.Min(DP[i-1,j-1],Math.Min(DP[i-1,j],DP[i-1,j+1]));
                DP[i,j]+=matrix[i][j];
            } 
            DP[i, matrix[0].Length-1] = Math.Min(DP[i-1, matrix[0].Length-1], DP[i-1, matrix[0].Length-2]);
            DP[i, matrix[0].Length-1] += matrix[i][matrix[0].Length-1];
        }
        
        int minimumValue=DP[matrix.Length-1,0];
            
        for(int i=0;i<matrix[0].Length;i++)
        {
            if(minimumValue>DP[matrix.Length-1,i])
            {
                minimumValue=DP[matrix.Length-1,i];
            }
        }
        
        return minimumValue;
    }
}