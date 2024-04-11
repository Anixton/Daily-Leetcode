/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if(Array.isArray(obj)){
        for(let i=0;i<obj.length;i++){
            if(!Boolean(obj[i])){
                obj.splice(i,1);
                i--;
             }
            
            if(typeof obj[i] === 'object'){
                compactObject(obj[i]);
            }
        }
    }  
    
    else{
        for(var key in obj){
            if(!Boolean(obj[key])){
                delete obj[key];
             }
            
            if(typeof obj[key] === 'object'){
                compactObject(obj[key]);
            }
        }
    }
    
    return obj;
};