class Solution {
    private char[][] grid;
    private String target;
    private boolean[][] visited;
    
    private boolean isPossible(int row, int column,int index){
        if(index == target.length()) return true;
        
        if(row<0 || row>=grid.length || column<0 || column>=grid[0].length || 
           visited[row][column] || grid[row][column]!=target.charAt(index)) {
            return false;
        }
        
        visited[row][column] = true;
        
        if(isPossible(row+1,column,index+1) || isPossible(row,column+1,index+1) || 
           isPossible(row,column-1,index+1) || isPossible(row-1,column,index+1)){
            return true;
        }
  
        visited[row][column] = false;
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        grid = board;
        target = word;
        visited = new boolean[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && isPossible(i,j,0)){
                    return true;
                }
            }
        }
        
        return false;
    }
}