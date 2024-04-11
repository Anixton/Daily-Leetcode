/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let result = {};
    
    for (let x = 0; x < arr1.length; x++) {
        result[arr1[x].id] = arr1[x];
    }
    
    for(let y = 0; y < arr2.length; y++){
        if(result[arr2[y].id]){
            for(const key in arr2[y]){
                result[arr2[y].id][key] = arr2[y][key];
            }
        } else {
            result[arr2[y].id]=arr2[y];
        }
    }
    
    return Object.values(result);
};