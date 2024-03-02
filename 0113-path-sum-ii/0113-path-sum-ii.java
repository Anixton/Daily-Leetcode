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
    private List<List<Integer>> result = new ArrayList<>();
    
    private void helper(TreeNode current,List<Integer> currentPath,int currentSum, int targetSum){
        if(current==null) return;
        if(currentSum==targetSum && current.left==null && current.right==null) {
            result.add(currentPath);
        }
        
        if(current.left!=null){
            List<Integer> alternative = new ArrayList<>(currentPath);
            alternative.add(current.left.val);
            helper(current.left,alternative,currentSum+current.left.val,targetSum);
        }
        
        
        if(current.right!=null){
            currentPath.add(current.right.val);
            helper(current.right,currentPath,currentSum+current.right.val,targetSum);
        }
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return result;
        }
        
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        helper(root,path,root.val,targetSum);
            
        return result;
    }
}