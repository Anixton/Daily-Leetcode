/**
 * @param {number} k
 */
var MyCircularDeque = function(k) {
    this.circularDeque = [];
    this.limiter = k;
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularDeque.prototype.insertFront = function(value) {
    if(this.circularDeque.length === this.limiter) return false;
    this.circularDeque.unshift(value);
    return true;
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularDeque.prototype.insertLast = function(value) {
    if(this.circularDeque.length === this.limiter) return false;
    this.circularDeque.push(value);
    return true;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.deleteFront = function() {
    if(this.circularDeque.length === 0) return false;
    this.circularDeque.shift();
    return true;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.deleteLast = function() {
    if(this.circularDeque.length === 0) return false;
    this.circularDeque.pop();
    return true;
};

/**
 * @return {number}
 */
MyCircularDeque.prototype.getFront = function() {
    if(this.circularDeque.length === 0) return -1;
    return this.circularDeque[0];
};

/**
 * @return {number}
 */
MyCircularDeque.prototype.getRear = function() {
    if(this.circularDeque.length === 0) return -1;
    return this.circularDeque[this.circularDeque.length - 1];
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.isEmpty = function() {
    return this.circularDeque.length === 0;
};

/**
 * @return {boolean}
 */
MyCircularDeque.prototype.isFull = function() {
    return this.circularDeque.length === this.limiter;
};

/** 
 * Your MyCircularDeque object will be instantiated and called as such:
 * var obj = new MyCircularDeque(k)
 * var param_1 = obj.insertFront(value)
 * var param_2 = obj.insertLast(value)
 * var param_3 = obj.deleteFront()
 * var param_4 = obj.deleteLast()
 * var param_5 = obj.getFront()
 * var param_6 = obj.getRear()
 * var param_7 = obj.isEmpty()
 * var param_8 = obj.isFull()
 */