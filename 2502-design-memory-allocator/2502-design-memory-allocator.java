class Allocator {
    private int[] storedValues;

    public Allocator(int n) {
        storedValues = new int[n];
    }
    
    public int allocate(int size, int mID) {
        int index = 0;
        
        while(index<storedValues.length){
            int secondIndex = index;
            Boolean found = false;
            
            while(secondIndex < storedValues.length && storedValues[secondIndex] == 0){
                if(secondIndex-index+1 == size){
                    found = true;
                    break;
                }
                secondIndex++;
            }
            
            if(found){
               for(int i=index;i<=secondIndex;i++){
                   storedValues[i] = mID;
               } 
               return index;
            }  else if(secondIndex == storedValues.length){
                return -1;
            }  else {
                index = secondIndex+1;
            }
        }
        
        return -1;
    }
    
    public int free(int mID) {
        int result = 0;
        for(int i=0;i<storedValues.length;i++){
            if(storedValues[i] == mID){
                storedValues[i] = 0;
                ++result;
            }
        }
        
        return result;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */