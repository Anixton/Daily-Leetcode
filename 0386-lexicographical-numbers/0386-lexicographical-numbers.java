class Solution {
    private List<Integer> result = new ArrayList<>();
    
    private void helper(String str,int upperLimit){
        int number = Integer.parseInt(str);
        if(number>upperLimit) return;
        
        result.add(number);
        
        for(int i=0;i<=9;i++){
            helper(str+String.valueOf(i),upperLimit);
        }
    }
    
    public List<Integer> lexicalOrder(int n) {
        for(int i=1;i<=9;i++){
            helper(String.valueOf(i),n);
        }
 
        return result;
    }
}