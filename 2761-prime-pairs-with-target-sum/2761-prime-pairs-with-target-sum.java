class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[1]=false;
        
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        
        for(int k=1;k<=(n/2);k++){
            if(prime[k] && prime[n-k]){
                List<Integer> pair = new ArrayList<>();
                pair.add(k);
                pair.add(n-k);
                result.add(pair);
            }
        }
        
        return result;
    }
}