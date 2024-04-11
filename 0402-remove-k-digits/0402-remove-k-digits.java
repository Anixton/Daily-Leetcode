class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> myStack = new Stack<>();
        
        for(int i=0;i<num.length();i++){
            while(!myStack.isEmpty() && k!=0 && myStack.peek()>num.charAt(i)){
                myStack.pop();
                k--;
            }
            
            myStack.push(num.charAt(i));
        }
        
        while(k!=0 && !myStack.isEmpty()){
            myStack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!myStack.isEmpty()){
            sb.append(myStack.pop());
        }
        
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        return sb.length() ==0 ? "0" : sb.toString();
        
    }
}