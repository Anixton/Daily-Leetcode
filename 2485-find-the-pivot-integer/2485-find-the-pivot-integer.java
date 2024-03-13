class Solution {
    public int pivotInteger(int n) {
       if(n == 1) return 1;
        
       for(int i=1;i<n;i++){
           int leftSide = (i+1)*i/2;
           int rightSide = -leftSide + (n*(n+1)/2) + i;
           
           if(leftSide == rightSide){
               return i;
           }
       } 
        
       return -1;
    }
}