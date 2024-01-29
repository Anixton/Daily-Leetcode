import java.util.Stack;

class MyQueue {
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;
    
    private void balanceStacks(){
        if(secondStack.isEmpty()){
            while(!firstStack.isEmpty()){
                int item = firstStack.pop();
                secondStack.push(item);
            }
        }
    }

    public MyQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }
    
    public void push(int x) {
        firstStack.push(x);
    }
    
    public int pop() {
        balanceStacks();
        return secondStack.pop();
    }
    
    public int peek() {
        balanceStacks();
        return secondStack.peek();
    }
    
    public boolean empty() {
        if(firstStack.isEmpty() && secondStack.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */