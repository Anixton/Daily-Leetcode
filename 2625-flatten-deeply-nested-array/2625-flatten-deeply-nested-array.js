/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    return recursiveFlattenArray(arr,n);
};

/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
function recursiveFlattenArray(arr,n) {
    if(n===0) return arr;
    
    let result = [];
    let isNecessaryToContinue = false;
    
    for(let i=0;i<arr.length;i++){
        if(Array.isArray(arr[i])){
            isNecessaryToContinue = true;
            for(let j=0;j<arr[i].length;j++){
                result.push(arr[i][j]);
            }
        } else {
            result.push(arr[i]);
        }
    }
    
    return isNecessaryToContinue ? recursiveFlattenArray(result,n-1) : result;
};