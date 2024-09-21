class Solution {
    private List<Integer> numbersInLexicographicalOrder = new ArrayList<>();
    
    private void generateNumbers(String currentNumberPrefix,int upperLimit){
        int currentNumber = Integer.parseInt(currentNumberPrefix);
        if (currentNumber > upperLimit) return;
        
        numbersInLexicographicalOrder.add(currentNumber);
        
        for (int digit = 0; digit <= 9; digit++) {
            generateNumbers(currentNumberPrefix + digit, upperLimit);
        }
    }
    
    public List<Integer> lexicalOrder(int upperLimit) {
        for (int startingDigit = 1; startingDigit <= 9; startingDigit++) {
            generateNumbers(String.valueOf(startingDigit), upperLimit);
        }
 
        return numbersInLexicographicalOrder;
    }
}