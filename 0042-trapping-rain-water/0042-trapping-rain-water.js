/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let maxLeft = [];
    let maxRight = [];
    let left = 0;
    let right = 0;
    let result = 0;
    
    for(let i = 0; i<height.length; i++){
        maxLeft.push(left);
        left = Math.max(left,height[i]);
    }
    
    for(let j=height.length-1; j>=0; j--){
        maxRight.unshift(right); 
        right = Math.max(right,height[j]);
    }
    
    for(let i=0; i<height.length;i++){
        let minWall = Math.min(maxLeft[i], maxRight[i]);
        result += Math.max(0, minWall - height[i]);
    }
    
    return result;
};