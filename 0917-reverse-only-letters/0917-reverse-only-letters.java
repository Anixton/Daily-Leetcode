class Solution {
    private Stack<Character> reversedLetters = new Stack<Character>();
    
    public String reverseOnlyLetters(String s) {
        pushLettersToStack(s);
        return reverseLettersAndReturn(s);
    }
    
    private void pushLettersToStack(String str) {
        for(Character ch : str.toCharArray()) {
            if(isLetter(ch)) {
                reversedLetters.push(ch);
            }
        }
    }
    
    private boolean isLetter(Character ch) {
        if(ch >= 'a' && ch <= 'z'){
            return true;
        } else if(ch >= 'A' && ch <= 'Z') {
            return true;
        }
        
        return false;
    }
    
    private String reverseLettersAndReturn(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int index = 0; index < str.length(); index++) {
            if(isLetter(str.charAt(index))) {
                stringBuilder.append(reversedLetters.pop());
            } else {
                stringBuilder.append(str.charAt(index));
            }
        }
        
        return stringBuilder.toString();
    }
}