/**
 * @param {number[][]} firstList
 * @param {number[][]} secondList
 * @return {number[][]}
 */
var intervalIntersection = function(firstList, secondList) {
    let firstPointer = 0;
    let secondPointer = 0;
    let result = [];
    
    while(firstPointer != firstList.length && secondPointer != secondList.length) {
        if(firstList[firstPointer][0] >= secondList[secondPointer][0] && firstList[firstPointer][0] <= secondList[secondPointer][1]) {
            let left = firstList[firstPointer][0];
            let right = Math.min(firstList[firstPointer][1], secondList[secondPointer][1]);
            result.push([left, right]);
        }
        
        else if(secondList[secondPointer][0] >= firstList[firstPointer][0] && secondList[secondPointer][0] <= firstList[firstPointer][1]) {
            let left = secondList[secondPointer][0];
            let right = Math.min(firstList[firstPointer][1], secondList[secondPointer][1]);
            result.push([left, right]);
        }
        
        if(secondList[secondPointer][1] > firstList[firstPointer][1]) {
            firstPointer++;
        } else {
            secondPointer++;
        }
    }
    
    return result;
};