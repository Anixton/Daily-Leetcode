/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(TreeNode current, int low, int high, ref int result)
    {
        if(current==null){return;}
        if(current.val>=low && current.val<=high){result+=current.val;}
        helper(current.left,low,high,ref result);
        helper(current.right,low,high,ref result);
    }
    public int RangeSumBST(TreeNode root, int low, int high) {
        int result=0;
        helper(root,low,high,ref result);
        return result;
    }
}