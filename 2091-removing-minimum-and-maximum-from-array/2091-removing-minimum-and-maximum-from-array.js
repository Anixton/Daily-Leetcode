/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumDeletions = function(nums) {
    let minimumIndex = 0;
    let maximumIndex = 0;
    
    for(let index = 1; index < nums.length; index++) {
        if(nums[index] > nums[maximumIndex]) {
            maximumIndex = index;
        }
        
        if(nums[index] < nums[minimumIndex]) {
            minimumIndex = index;
        }
    }
    
    let firstOption = Math.max(minimumIndex, maximumIndex) + 1;
    let secondOption = nums.length - Math.min(minimumIndex, maximumIndex);
    let thirdOption = Math.min(minimumIndex, maximumIndex) + (nums.length - Math.max(minimumIndex, maximumIndex)) + 1;

    return Math.min(firstOption, Math.min(secondOption, thirdOption));
}