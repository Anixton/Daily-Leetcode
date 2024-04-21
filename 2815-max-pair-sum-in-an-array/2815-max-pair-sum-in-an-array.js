/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSum = function(nums) {
    let maximumDigit = Array(10).fill(-1);
    let result = -1;
    
    for(let index = 0; index < nums.length; index++) {
        if(maximumDigit[getMaxDigit(nums[index])] === -1) {
            maximumDigit[getMaxDigit(nums[index])] = nums[index];
            continue;
        }
        
        result = Math.max(result, maximumDigit[getMaxDigit(nums[index])] + nums[index]);
        maximumDigit[getMaxDigit(nums[index])] = Math.max(maximumDigit[getMaxDigit(nums[index])],nums[index]);
    }
    
    return result;
};

function getMaxDigit(value) {
    let result = 0;
    
    while(value !== 0) {
        result = Math.max(result, value % 10);
        value = Math.floor(value / 10); 
    }
    
    return result;
}