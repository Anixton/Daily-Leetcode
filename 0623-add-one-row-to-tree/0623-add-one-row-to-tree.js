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
 * @param {number} val
 * @param {number} depth
 * @return {TreeNode}
 */
var addOneRow = function(root, val, depth) {
    if (depth === 1) {
        return new TreeNode(val, root, null);
    }
    helper(root, val, 1, depth);
    return root;
};

function helper(current, val, currentDepth, targetDepth) {
    if (current === null) {
        return null;
    }
    if (targetDepth === currentDepth + 1) {
        let leftNode = new TreeNode(val, current.left, null);
        let rightNode = new TreeNode(val, null, current.right);
        current.left = leftNode;
        current.right = rightNode;
    } else {
        helper(current.left, val, currentDepth + 1, targetDepth);
        helper(current.right, val, currentDepth + 1, targetDepth);
    }
    return current;
}