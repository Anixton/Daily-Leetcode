class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(n);
        
        int modBy = 10;
        int number = 0;
        int currentNum=n;
        
        while(true) {
            while(currentNum != 0) {
                number+=(currentNum%modBy)*(currentNum%modBy);
                currentNum/=10;
            }

            
            if(number == 1) return true;
        
            if(values.contains(number)) return false;
            else {
                values.add(number);
            }        
    
            modBy=10;
            currentNum=number;
            number=0;
        }
    }
}