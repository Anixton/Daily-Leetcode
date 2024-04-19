/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    let result = 0;
    
    for(let row = 0; row < grid.length; row++) {
        for(let column = 0; column < grid[0].length; column++) {
            if(grid[row][column] === "1") {
                result++;
                helper(grid, row, column);
            }
        }
    }
    
    return result;
};

function helper(grid, row, column) {
    if(row < 0 || row >= grid.length || column < 0 || 
       column >= grid[0].length || grid[row][column] !== "1") return;
    
    grid[row][column] = "2";
    
    helper(grid, row, column + 1);
    helper(grid, row, column - 1);
    helper(grid, row + 1, column);
    helper(grid, row - 1, column);
}