/**
 * @param {number[]} arr
 * @return {number}
 */
var maxTurbulenceSize = function(arr) {
    let result = 1;
    let increaseOption = 1;
    let decreaseOption = 1;
    
    for(let index = 1; index < arr.length; index++){
        if(arr[index] > arr[index-1]){
            increaseOption = decreaseOption + 1;
            decreaseOption = 1;
        } else if(arr[index] < arr[index-1]){
            decreaseOption = increaseOption + 1;
            increaseOption = 1;
        } else {
            increaseOption = 1;
            decreaseOption = 1;
        }
        
        result = Math.max(result, Math.max(increaseOption, decreaseOption));
    }
    
    return result;
};