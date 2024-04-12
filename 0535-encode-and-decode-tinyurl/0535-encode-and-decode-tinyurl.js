let hashMap = {};

/**
 * Encodes a URL to a shortened URL.
 *
 * @param {string} longUrl
 * @return {string}
 */
var encode = function(longUrl) {
    const code = Math.random().toString(32).slice(5)
    const tinyUrl = "https://tinyurl.com/${code}";
    
    hashMap[tinyUrl] = longUrl;
    return tinyUrl;
};

/**
 * Decodes a shortened URL to its original URL.
 *
 * @param {string} shortUrl
 * @return {string}
 */
var decode = function(shortUrl) {
    return hashMap[shortUrl];
};

/**
 * Your functions will be called as such:
 * decode(encode(url));
 */