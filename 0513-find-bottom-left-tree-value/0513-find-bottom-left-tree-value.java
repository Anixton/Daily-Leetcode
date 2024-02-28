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
    private int currentHeight = 0 ;
    private int currentValue = 0;
    
    public void helper(TreeNode current, int height){
        if(current == null ){
            return ;
        } else if(height>currentHeight){
            currentHeight=height;
            currentValue = current.val;
        } 
        
        helper(current.left,height+1);
        helper(current.right,height+1);
    }
    
    public int findBottomLeftValue(TreeNode root) {
        currentValue = root.val;
        helper(root.left , 1);
        helper(root.right , 1);
        
        return currentValue;
        
    }
}