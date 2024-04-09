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
    private int total = 0;
    
    public void helper(TreeNode current,boolean toLeft){
        if(current == null) return;
        
        if(current.left == null && current.right == null){
            if(toLeft){
               total+=current.val; 
            } 
            return;
        }
            
        helper(current.left,true);
        helper(current.right,false);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,false);
        return total;
    }
}