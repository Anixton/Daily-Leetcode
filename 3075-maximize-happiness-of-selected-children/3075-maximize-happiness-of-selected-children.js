/**
 * @param {number[]} happiness
 * @param {number} k
 * @return {number}
 */
var maximumHappinessSum = function(happiness, k) {
    happiness.sort((a, b) => b - a);
    let result = 0;
    
    for(let counter = 0; counter < k; counter++){
        result += Math.max(0,happiness[counter] - counter);
    }
    
    return result;
};