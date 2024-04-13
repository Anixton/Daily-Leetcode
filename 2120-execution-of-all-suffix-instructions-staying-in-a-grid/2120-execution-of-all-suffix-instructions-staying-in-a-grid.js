/**
 * @param {number} n
 * @param {number[]} startPos
 * @param {string} s
 * @return {number[]}
 */
var executeInstructions = function(n, startPos, s) {
    let upperLimit = n - 1;
    let result = [];
    
    for(let index = 0; index < s.length; index++) {
        let currentRow = startPos[0];
        let currentCol = startPos[1];
        let secondIndex = index;
        
        while(secondIndex < s.length) {
            switch(s[secondIndex]) {
              case 'L':
                currentCol--;
                break;
              case 'U':
                currentRow--;
                break;
              case 'R':
                currentCol++;
                break;
              case 'D':
                currentRow++;
                break;
              default:
                break;
            }
            
            if(currentCol < 0 || currentCol > upperLimit || currentRow < 0 || currentRow > upperLimit) {
                break;
            }
            
            secondIndex++;
        }
        
        result.push(secondIndex - index);
    }
    
    return result;
};