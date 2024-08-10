/**
    0,0 -> 0,2
    0,1 -> 1,2
    0,2 -> 2,2
    
    1,0 -> 0,1
    1,1 -> 1,1
    1,2 -> 2,1
    
    2,0 -> 0,0
    2,1 -> 1,0
    2,2 -> 2,0  
*/

class Solution {
    private static final int MAX_ROTATIONS = 3;
    
    public boolean findRotation(int[][] mat, int[][] target) {
        if(checkIfMatricesAreEqual(mat, target)) {
            return true;
        }
        
        for(int rotationCount = 0; rotationCount < MAX_ROTATIONS; rotationCount++) {
            rotateMatrix(mat);
            
            if(checkIfMatricesAreEqual(mat, target)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean checkIfMatricesAreEqual(int[][] mat, int[][] target){
        for(int row = 0; row < mat.length; row++) {
            for(int column = 0; column < mat[0].length; column++) {
                if(mat[row][column] != target[row][column]) {
                    return false;
                }
            }    
        }
        
        return true;
    }
    
    private void rotateMatrix(int[][] mat) {
        final int size = mat.length;
        int[][] rotatedMat = new int[size][size];
        
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                rotatedMat[column][size - 1 - row] = mat[row][column];
            }
        }
        
        copyMatrix(rotatedMat, mat);
    }
    
    private void copyMatrix(int[][] source, int[][] destination) {
        for (int row = 0; row < source.length; row++) {
            for (int column = 0; column < source[0].length; column++) {
                destination[row][column] = source[row][column];
            }
        }
    }
}