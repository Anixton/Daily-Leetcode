class Solution {
    public String makeGood(String s) {
        Stack<Character> charStack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if (charStack.isEmpty()) {
                charStack.push(s.charAt(i));
                continue;
            }
            
            char current = charStack.peek();
            if(Character.toLowerCase(current) == Character.toLowerCase(s.charAt(i)) && current!=s.charAt(i)){
                charStack.pop();
            } else {
                charStack.push(s.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!charStack.isEmpty()){
            sb.insert(0,charStack.pop());
        }
        
        return sb.toString();
    }
}