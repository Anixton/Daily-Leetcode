class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n<=1) return true;
            else if(n==0) return true;
        }
        
        int optionOdd=0;
        int optionEven=0;
        
        for(int i=1;i<flowerbed.length-1;i++){
            if(i%2==0){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                    optionEven++;
                }
            } else {
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                    optionOdd++;
                }
            }
        }
        
        if(flowerbed[0]==0 && flowerbed[1]==0){
            optionEven++;
        }
        
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            if((flowerbed.length-1)%2==0){
                optionEven++;
            }  else {
                optionOdd++;
            }
        }
        
        if(optionOdd>=n || optionEven>=n){
            return true;
        }
        
        return false;
    }
}