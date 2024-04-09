class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;
        
        while(tickets[k]!=0){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]!=0){
                    result++;
                    tickets[i]--;
                }
                
                if(i==k && tickets[i]==0) return result;
            }
        }
        
        return result;
    }
}