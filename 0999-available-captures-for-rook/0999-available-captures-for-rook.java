class Solution {
    public int numRookCaptures(char[][] board) {
        int result = 0;
        int row = -1;
        int column = -1;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='R'){
                    row = i;
                    column = j;
                }
            }
        }
        
        int variable = row-1; 
        while(variable != -1){
            if(board[variable][column]!='.'){
                if(board[variable][column]=='p'){
                    result++;
                }
                break;
            }
            variable--;
        }
        
        variable = row+1;   
        while(variable != board.length){
            if(board[variable][column]!='.'){
                if(board[variable][column]=='p'){
                    result++;
                }
                break;
            }
            variable++;
        }
        
        variable = column-1; 
        while(variable != -1){
            if(board[row][variable]!='.'){
                if(board[row][variable]=='p'){
                    result++;
                }
                break;
            }
            variable--;
        }
        
        variable = column+1; 
        while(variable != board[0].length){
            if(board[row][variable]!='.'){
                if(board[row][variable]=='p'){
                    result++;
                }
                break;
            }
            variable++;
        }
        
        return result;
    }
}