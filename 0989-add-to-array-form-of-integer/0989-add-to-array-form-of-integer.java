class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int numIndex = num.length-1;
        
        while(k!=0 && numIndex>=0){
            int value = k%10 + num[numIndex] + count;
            result.add(0,value%10);
            count = (value >= 10) ? 1 : 0;
            k/=10;
            numIndex--;
        }
        
        while(k!=0){
            int value = k%10 +  count;
            result.add(0,value%10);
            count = (value >= 10) ? 1 : 0;
            k/=10;
        }
        
        while(numIndex>=0){
            int value = num[numIndex] + count;
            result.add(0,value%10);
            count = (value >= 10) ? 1 : 0;
            numIndex--;
        }
        
        while(count!=0){
            result.add(0,count);
            count = 0;
        }
        
        return result;
    }
}