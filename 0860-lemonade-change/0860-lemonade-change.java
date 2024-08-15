class Solution {
    
    private int fiveDolarCount = 0;
    private int tenDolarCount = 0;
    
    public boolean lemonadeChange(int[] bills) {
        for(int customersPayment : bills) {
            if(customersPayment == 5) {
                fiveDolarPayment();
            } else if(customersPayment == 10) {
                if(!tenDolarPayment()) {
                    return false;
                }
            } else {
                if(!twentyDolarPayment()) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean fiveDolarPayment() {
        fiveDolarCount++;
        return true;
    }
    
    private boolean tenDolarPayment() {
        tenDolarCount++;
        return fiveDolarCount-- > 0;
    }
    
    private boolean twentyDolarPayment() {
        if(tenDolarCount > 0 && fiveDolarCount > 0) {
            tenDolarCount--;
            fiveDolarCount--;
            return true;
        }
        
        if(fiveDolarCount >= 3) {
            fiveDolarCount -= 3;
            return true;
        }
        
        return false;
    }
}