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
    private boolean same=true;
    
    private void helper(TreeNode first, TreeNode second){
        if(first==null && second==null){
            return;
        } else if(first==null || second == null){
            same=false;
            return;
        } else if(first.val!=second.val){
            same=false;
            return;
        } else {
            helper(first.left,second.left);
            helper(first.right,second.right);
            return;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
        return same;
    }
}