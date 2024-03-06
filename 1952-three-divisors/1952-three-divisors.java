class Solution {
    public boolean isThree(int n) {
        int limit = (int) Math.sqrt(n);
        HashSet<Integer> divisors = new HashSet<Integer>();
        
        for(int i=1;i<=limit;i++){
            if(n%i==0){
                divisors.add(i);
                divisors.add(n/i);
            }
        }
            
        return divisors.size() == 3;
    }
}