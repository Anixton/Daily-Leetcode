/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    let result = 0;
    let orderedHeight = [...heights];
    orderedHeight.sort((a,b) => a - b);
    
    for(let index = 0; index < heights.length; index++) {
        if(heights[index] !== orderedHeight[index]) {
            result++;
        }
    }
    
    return result;
};