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
 * @return {number}
 */
var sumOfLeftLeaves = function(root) {
    let result = {sum: 0};
    
    if(root === null) return 0;
    else if(root.left === null && root.right === null) return 0;
    
    helper(root.left, true, result);
    helper(root.right, false, result);
    
    return result.sum;
};

function helper(current, isLeft, result) {
    if(current === null) return;
    else if(current.left === null && current.right === null) {
        if(isLeft) {
            result.sum += current.val; 
        }
        return;
    }
    
    helper(current.left, true, result);
    helper(current.right, false, result);
}