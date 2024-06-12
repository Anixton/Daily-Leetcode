/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let zero = 0;
    let one = 0;
    let two = 0;
    
    for(let index = 0; index < nums.length; index++) {
        if(nums[index] === 0) {
            zero++;
        } else if(nums[index] === 1) {
            one++;
        } else {
            two++;
        }
    }
    
    for(let index = 0; index < nums.length; index++) {
        if(zero > 0) {
            nums[index] = 0;
            zero--;
        }  else if (one > 0){
            nums[index] = 1;
            one--;
        } else if (two > 0){
            nums[index] = 2;
            two--;
        } else {
            return;
        }
    }
};