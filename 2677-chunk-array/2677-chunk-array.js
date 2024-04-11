/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let result = [];
    
    let index = 0;
    while(index<arr.length){
        let element = [];
        
        for(let i=0;i<size;i++){
            if(arr.length<=index+i){
                break;
            }
            element.push(arr[index+i]);
        }
        
        result.push(element);
        index+=size;
    }
    
    return result;
};
