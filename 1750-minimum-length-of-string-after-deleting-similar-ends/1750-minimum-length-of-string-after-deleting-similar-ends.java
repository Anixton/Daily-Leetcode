class Solution {
    public int minimumLength(String s) {
        int leftPointer=0;
        int rightPointer=s.length()-1;
        
        while(leftPointer<rightPointer && s.charAt(leftPointer)==s.charAt(rightPointer)) {
            leftPointer++;
            rightPointer--;
            
            while(leftPointer<=rightPointer && s.charAt(leftPointer-1)==s.charAt(leftPointer)) {
                leftPointer++;
            }
            
            while(leftPointer<=rightPointer && s.charAt(rightPointer)==s.charAt(rightPointer+1)) {
                rightPointer--;
            }
        }
        
        return rightPointer<leftPointer ? 0 : rightPointer-leftPointer+1;
    }
}