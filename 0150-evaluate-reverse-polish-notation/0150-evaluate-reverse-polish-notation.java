import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> intStack = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int secondValue= intStack.pop();
                int firstValue = intStack.pop();
                intStack.push(firstValue+secondValue);
            }
            else if(tokens[i].equals("-")){
                int secondValue= intStack.pop();
                int firstValue = intStack.pop();
                intStack.push(firstValue-secondValue);
            }
            else if(tokens[i].equals("*")){
                int secondValue= intStack.pop();
                int firstValue = intStack.pop();
                intStack.push(firstValue*secondValue);
            }
            else if(tokens[i].equals("/")){
                int secondValue= intStack.pop();
                int firstValue = intStack.pop();
                intStack.push(firstValue/secondValue);
            }
            else{
                int intValue = Integer.parseInt(tokens[i]);
                intStack.push(intValue);
            }
        }
        return intStack.pop();
    }       
}