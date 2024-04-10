/**
 * @param {number[]} nums
 * @return {void}
 */
var ArrayWrapper = function(nums) {
    this.number = nums;
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function() {
    return this.number.reduce((a, b) => a + b, 0);
}

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function() {
    var result  = "[";
    
    if(this.number.length === 0){
        result += "]";
        return result;
    }
    
    result += this.number[0];
    
    for(let i = 1; i < this.number.length; i++){
        result += ",";
        result += this.number[i];
    }
    
    result += "]";
    return result;
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */