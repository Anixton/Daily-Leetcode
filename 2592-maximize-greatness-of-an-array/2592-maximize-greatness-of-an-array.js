/**
 * @param {number[]} nums
 * @return {number}
 */
var maximizeGreatness = function(nums) {
    let sortedNums = nums.slice().sort((a, b) => a - b);
    let leftPointer = 0;
    let rightPointer = 1;
    let result = 0;
    
    while(rightPointer < sortedNums.length){
        if(sortedNums[rightPointer] > sortedNums[leftPointer]){
            result++;
            rightPointer++;
            leftPointer++;
        } else {
            rightPointer++;
        }
    }
    
    return result;
};