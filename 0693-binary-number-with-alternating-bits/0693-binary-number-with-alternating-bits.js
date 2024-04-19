/**
 * @param {number} n
 * @return {boolean}
 */
var hasAlternatingBits = function(n) {
    let bitValue = n.toString(2);
    
    for(let index = 1; index < bitValue.length; index++) {
        if(bitValue[index] === bitValue[index - 1]) return false;
    }
    
    return true;
};