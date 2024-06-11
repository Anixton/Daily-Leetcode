/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    let HM = {};
    
    for(let index = 0; index < arr1.length; index++) {
        if(arr1[index] in HM) {
            HM[arr1[index]]++;
        } else {
            HM[arr1[index]] = 1;
        }
    }
    
    let result = [];
    let resultIndex = 0;
    
    for(let index = 0; index < arr2.length; index++) {
        for(let count = 0; count < HM[arr2[index]]; count++) {
            result[resultIndex++] = arr2[index];
        }
        HM[arr2[index]] = 0;
    }
    
    arr1.sort((a,b) => a - b);
    
    for(let index = 0; index < arr1.length; index++) {
        for(let count = 0; count < HM[arr1[index]]; count++) {
            result[resultIndex++] = arr1[index];
        }
        HM[arr1[index]] = 0;
    }
    
    return result;
};