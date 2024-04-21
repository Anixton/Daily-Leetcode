let MOD = Math.pow(10, 9) + 7;

/**
 * @param {number[]} nums
 * @return {number}
 */
var countNicePairs = function(nums) {
    let hashMap = {};
    
    for(let index = 0; index < nums.length; index++) {
        let reversedValue = helper(nums[index]);
        let diff = nums[index] - reversedValue;
        hashMap[diff] = (hashMap[diff] || 0) + 1;
    }
    
    let result = 0;
    
    for(let key in hashMap) {
        result += (hashMap[key] * (hashMap[key] - 1)) / 2;
        result %= MOD;
    }
    
    return result;
};
    
/**
 * @param {number} value
 * @return {number}
 */
function helper(value) {
    let result = 0;
    
    while(value !== 0) {
        result *= 10;
        result += (value % 10);
        value = Math.floor(value / 10);
    }
    
    return result;
}
