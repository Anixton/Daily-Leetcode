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
public class Solution {
    private int result=int.MinValue;
    public void helper(int max,int min,TreeNode current)
    {
        if(current==null){return;}
        if(current.val>max){max=current.val;}
        if(current.val<min){min=current.val;}
        if(max-min>result){result=max-min;}
        helper(max,min,current.left);
        helper(max,min,current.right);
        
    }
    public int MaxAncestorDiff(TreeNode root) {
        helper(int.MinValue,int.MaxValue,root);
        return result;
    }
}