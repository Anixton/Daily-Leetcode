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
    public TreeNode helper(TreeNode current, int target) {
        if(current == null) return null;
        
        current.left = helper(current.left, target);
        current.right = helper(current.right, target);
        
        if(current.left == null && current.right == null && current.val == target) {
            return null;
        }
        
        return current;
    }
    
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return helper(root, target);
    }
}