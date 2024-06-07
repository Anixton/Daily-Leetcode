/**
 * @param {string[]} dictionary
 * @param {string} sentence
 * @return {string}
 */
var replaceWords = function(dictionary, sentence) {
    let result = "";
    let stringArray = sentence.split(" ");
    
    for(let index = 0; index < stringArray.length; index++) {
        let candidate = "";
        let found = false;
        
        for(let subIndex = 0; subIndex < stringArray[index].length; subIndex++) {
            candidate += stringArray[index][subIndex];
            
            if(dictionary.includes(candidate)) {
                result += candidate;
                found = true;
                break;
            }
        }
        
        if(!found) {
            result += stringArray[index];
        }
        
        if(index !== stringArray.length - 1) {
            result += " ";
        }
    }
    
    return result;
};