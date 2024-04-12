/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAbsoluteSum = function(nums) {
    let maxEndingHere = nums[0];
    let maxOfAll = nums[0];
    
    let minEndingHere = nums[0];
    let minOfAll = nums[0];
    
    for(let i = 1; i < nums.length; i++){
        maxEndingHere = Math.max(nums[i], nums[i] + maxEndingHere);
        maxOfAll = Math.max(maxOfAll, maxEndingHere);
        
        minEndingHere = Math.min(nums[i], nums[i] + minEndingHere);
        minOfAll = Math.min(minOfAll, minEndingHere);
    }
    
    return Math.max(Math.abs(maxOfAll), Math.abs(minOfAll));
};