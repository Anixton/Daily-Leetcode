/**
 * @param {number[]} nums
 * @return {number}
 */
var minIncrementForUnique = function(nums) {
    const mySet = new Set();
    nums.sort((a,b) => a - b);
    let result = 0;
    
    mySet.add(nums[0]);
    let maxValueAdded = nums[0];
    
    for(let index = 1; index < nums.length; index++) {
        if(!mySet.has(nums[index])) {
            mySet.add(nums[index]);
            maxValueAdded = nums[index];
        } else {
            maxValueAdded++;
            mySet.add(maxValueAdded);
            result += maxValueAdded - nums[index];
        }
    }
    
    return result;
};