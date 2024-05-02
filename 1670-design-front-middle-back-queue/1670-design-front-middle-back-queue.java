class FrontMiddleBackQueue {
    private List<Integer> frontMiddleBack;

    public FrontMiddleBackQueue() {
        frontMiddleBack = new ArrayList<>();
    }
    
    public void pushFront(int val) {
        frontMiddleBack.add(0,val);
    }
    
    public void pushMiddle(int val) {
        frontMiddleBack.add(frontMiddleBack.size()/2,val);
    }
    
    public void pushBack(int val) {
        frontMiddleBack.add(frontMiddleBack.size(),val);
    }
    
    public int popFront() {
        if(frontMiddleBack.size() == 0) return -1;
        
        int value = frontMiddleBack.remove(0);
        return value;
    }
    
    public int popMiddle() {
        if(frontMiddleBack.size() == 0) return -1;
        
        int value = frontMiddleBack.remove((frontMiddleBack.size() - 1)/ 2);
        return value;
    }
    
    public int popBack() {
        if(frontMiddleBack.size() == 0) return -1;
        
        int value = frontMiddleBack.remove(frontMiddleBack.size() - 1);
        return value;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */