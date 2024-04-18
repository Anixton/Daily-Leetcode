/**
 * @param {number[][]} grid
 * @return {number}
 */
var islandPerimeter = function(grid) {
    let result = 0;
    
    for(let row = 0; row < grid.length; row++) { 
        for(let column = 0; column < grid[0].length; column++) {
            if(grid[row][column] === 1) {
                result += 4;
                
                if(row > 0 && grid[row - 1][column] === 1) {
                    result -= 2;
                }
                
                if(column > 0 && grid[row][column - 1] === 1) {
                    result -= 2;
                }
            }
        }
    }
    
    return result;
};
