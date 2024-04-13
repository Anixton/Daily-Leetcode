/**
 * @param {number} num
 * @return {number[]}
 */
var closestDivisors = function(num) {
    let result = Number.MAX_SAFE_INTEGER;
    let firstDivisor = -1;
    let secondDivisor = -1;
    let currentNum = num + 1;
    
    for(let i = 1; i <= Math.sqrt(currentNum); i++) {
        if(currentNum % i === 0) {
            let secondValue = (currentNum / i);
            
            if(result > secondValue - i) {
                result = secondValue - i;
                firstDivisor = secondValue;
                secondDivisor = i;
            }
        }
    }
    
    currentNum++;
    
    for(let i = 1; i <= Math.sqrt(currentNum); i++) {
        if(currentNum % i === 0) {
            let secondValue = (currentNum / i);
            
            if(result > secondValue - i) {
                result = secondValue - i;
                firstDivisor = secondValue;
                secondDivisor = i;
            }
        }
    }
    
    return [firstDivisor, secondDivisor];
};