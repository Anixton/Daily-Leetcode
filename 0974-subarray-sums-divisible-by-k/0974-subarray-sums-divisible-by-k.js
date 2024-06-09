/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraysDivByK = function(nums, k) {
    nums.unshift(0);
    for(let index = 1; index < nums.length; index++) {
        nums[index] += nums[index - 1];
    }
    
    let result = 0;
    let map = {0: 1};
    
    for(let rightIndex = 1; rightIndex < nums.length; rightIndex++) {
        let current = ((nums[rightIndex] % k) + k) % k;
        if(map.hasOwnProperty(current)){
            result += map[current];
        }
        map[current] = (map[current] || 0) + 1;
    }
    
    return result;
};