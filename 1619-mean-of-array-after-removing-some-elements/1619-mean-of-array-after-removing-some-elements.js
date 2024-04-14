/**
 * @param {number[]} arr
 * @return {number}
 */
var trimMean = function(arr) {
    arr.sort((a, b) => a - b);
    let deletionCount = Math.ceil(arr.length / 20);
    let total = 0;
    
    for(let index = deletionCount; index < arr.length - deletionCount; index++) {
        total += arr[index];
    }
    
    total /= (arr.length - (2*deletionCount));
    return total;
};