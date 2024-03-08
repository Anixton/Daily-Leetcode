/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let myMap = new Map();
    
    return function(...args) {
        let key = JSON.stringify(args);
        if(myMap.has(key)){
            return myMap.get(key);
        }
        
        let result = fn(...args);
        myMap.set(key, result);
        return result;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */