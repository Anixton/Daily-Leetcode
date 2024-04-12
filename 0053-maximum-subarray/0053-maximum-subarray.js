/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let maximumEndingHere = nums[0];
    let maximumOfAll = nums[0];
    
    for(let i = 1; i < nums.length; i++){
        maximumEndingHere = Math.max(nums[i], maximumEndingHere + nums[i]);
        maximumOfAll = Math.max(maximumOfAll, maximumEndingHere);
    }
    
    return maximumOfAll;
};