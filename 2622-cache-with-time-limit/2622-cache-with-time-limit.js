var TimeLimitedCache = function() {
    this.map = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    let exists = this.map.has(key);
    if (exists) {
        clearTimeout(this.map.get(key).timeout);
    }
    let timeout = setTimeout(() => {
        this.map.delete(key);
    },duration);
    this.map.set(key, {value,timeout});
    return exists;
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    let item = this.map.get(key);
    if(item) {
        return item.value;
    }
    return -1;
};

TimeLimitedCache.prototype.count = function() {
    return this.map.size;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */