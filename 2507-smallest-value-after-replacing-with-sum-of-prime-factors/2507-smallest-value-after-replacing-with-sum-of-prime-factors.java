class Solution {
    private boolean isPrime(int current){
        if(current == 1) return false;
        for(int i = 2; i <= current-1; i++){
            if(current % i == 0) return false;
        }
        return true; 
    }
    
    public int smallestValue(int n) {
        HashSet<Integer> alreadyVisitted = new HashSet<Integer>();
        alreadyVisitted.add(n);
        
        while(!isPrime(n)){
            int nextValue = 0;
            int loopVar=n;

            for(int i = 2; i < loopVar; i++){
                while(n != 1 && isPrime(i) && n % i == 0){
                    nextValue += i;
                    n/=i;
                }
            }
            
            n=nextValue;
            
            if(alreadyVisitted.contains(n)) return n;
            else {
                alreadyVisitted.add(n);
            }
        }

        return n;
    }
}