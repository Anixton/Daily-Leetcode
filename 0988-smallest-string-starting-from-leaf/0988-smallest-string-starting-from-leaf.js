/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */

/**
 * @param {TreeNode} root
 * @return {string}
 */
var smallestFromLeaf = function(root) {
    return helper(root, "");
};

/**
 * @param {TreeNode} current
 * @param {string} str
 * @return {string}
 */
function helper(current, str) {
    if (current === null) {
        return str;
    }
    
    let newStr = String.fromCharCode(97 + current.val) + str;
    let leftResult = helper(current.left, newStr);
    let rightResult = helper(current.right, newStr);
    
    if (current.left !== null && current.right !== null) {
        return leftResult < rightResult ? leftResult : rightResult;
    }
    
    return current.left !== null ? leftResult : rightResult;
}