/**
 * @param {number[]} nums
 * @return {number}
 */
var findMiddleIndex = function(nums) {
    let total = 0;
    
    for(let index = 0; index < nums.length; index++) {
        total+= nums[index];
    }
    
    let totalSoFar = 0;
    
    for(let index = 0; index < nums.length; index++) {
        let current = total - (totalSoFar + nums[index]);
        
        if(current === totalSoFar) return index;
        
        totalSoFar += nums[index];
    }
    
    return -1;
};