class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
            flipTheImage(row);
            invertTheImage(row);
        }
        
        return image;
    }
    
    private void flipTheImage(int[] row) {
        for(int leftIndex = 0; leftIndex < (row.length / 2); leftIndex++) {
            int rightIndex = row.length - leftIndex - 1;
            int temperateValue = row[leftIndex];
            
            row[leftIndex] = row[rightIndex];
            row[rightIndex] = temperateValue;
        }
    }
    
    private void invertTheImage(int[] row) {
        for(int i = 0; i < row.length; i++) {
            row[i] = row[i] == 1 ? 0 : 1; 
        }
    }
}