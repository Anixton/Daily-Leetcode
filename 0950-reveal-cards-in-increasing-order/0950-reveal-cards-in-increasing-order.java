class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> DQ = new LinkedList<>();
        
        for(int i=0;i<deck.length;i++){
            DQ.offer(i);
        }
        
        int[] result = new int[deck.length];
        for(int i=0;i<deck.length;i++){
            result[DQ.poll()]=deck[i];
            
            if(!DQ.isEmpty()){
                DQ.offer(DQ.poll());
            }
        }
        
        return result;
    }
}