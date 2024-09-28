class MyCircularDeque {

    private List<Integer> dequeElements;
    private final int maxCapacity;

    public MyCircularDeque(int maxCapacity) {
        this.dequeElements = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        dequeElements.add(0, value);
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }

        dequeElements.add(value);
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        dequeElements.remove(0);
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        int lastIndex = dequeElements.size() - 1;
        dequeElements.remove(lastIndex);
        return true;
    }
    
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }

        return dequeElements.get(0);
    }
    
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }

        int rearIndex = dequeElements.size() - 1;
        return dequeElements.get(rearIndex);
    }
    
    public boolean isEmpty() {
        return dequeElements.isEmpty();
    }
    
    public boolean isFull() {
        return dequeElements.size() == maxCapacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */