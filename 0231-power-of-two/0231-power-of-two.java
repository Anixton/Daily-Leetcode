class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        else if(n<1) return false;
        else {
            while(n%2==0){
                if(n==2) return true;
                else {
                    n/=2;
                }
            }
            return false;
        }
    }
}