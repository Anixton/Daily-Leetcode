/**
 * @param {number[]} nums
 * @return {number}
 */
var findGCD = function(nums) {
    let minimumValue = nums[0];
    let maximumValue = nums[0];
    
    for(let index = 0; index < nums.length; index++) {
        if(nums[index] > maximumValue) {
            maximumValue = nums[index];
        }
        
        if(nums[index] < minimumValue) {
            minimumValue = nums[index];
        }
    }
    
    let gcd = minimumValue;
    
    while(gcd !== 1) {
        if(minimumValue % gcd === 0 && maximumValue % gcd === 0) {
            return gcd;
        }
        
        gcd--;
    }
    
    return gcd;
};