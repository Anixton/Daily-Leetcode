/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean helper(TreeNode root) {
        if(root.val == 0) {
            return false;
        } else if(root.val == 1) {
            return true;
        } else if(root.val == 2) {
            return helper(root.left) || helper(root.right);
        } else {
            return helper(root.left) && helper(root.right);
        }
    }
    
    public boolean evaluateTree(TreeNode root) {
        return helper(root);
    }
}