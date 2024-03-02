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
    private int result=0;
    
    private void helper(TreeNode current,int total){
        if(current.left==null && current.right==null){
            result+=total;
            return;
        }
        
        if(current.left!=null) {
            helper(current.left,10*total+current.left.val);
        }
        
        if(current.right!=null){
            helper(current.right,10*total+current.right.val);
        }
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        
        helper(root,root.val);  
        return result;
    }
}