class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> myStack = new Stack<Integer>();
        List<Integer> myList = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(myStack.isEmpty()){
                    myList.add(i);
                } else {
                    myStack.pop();
                }
            } else if(s.charAt(i)=='('){
                myStack.push(i);
            } else {
                continue;
            }
        }
        
        while(!myStack.isEmpty()){
            myList.add(myStack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!myList.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}