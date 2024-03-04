class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==1){
            return power>tokens[0] ? 1 : 0;
        }
        Arrays.sort(tokens);
        int firstOption=0;
        int firstPower=power;
        int secondStart=-1;
        int secondEnd=tokens.length-1;
        
        for(int i=0;i<tokens.length;i++){
            if(firstPower<tokens[i]){
                secondStart=i;
                break;
            } else {
                firstPower-=tokens[i];
                firstOption++;
            }
        }
        
        while(secondStart!=secondEnd && tokens[secondStart]<tokens[secondEnd] && firstOption>0) {
            firstPower+=(tokens[secondEnd]-tokens[secondStart]);
            secondEnd--;
            secondStart++;
            
            while(secondStart<=secondEnd && tokens[secondStart]<=firstPower){
                firstOption++;
                firstPower-=tokens[secondStart++];
            }
        }
        
        return firstOption;     
    }
}