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
    private List<List<Integer>> storedValues = new ArrayList<>();
        
    private void helper(int height,TreeNode current) {
        if(current==null){
            return;
        }
        
        while (storedValues.size() <= height) {
            storedValues.add(new ArrayList<>());
        }   
        
        if(height%2==0){
           storedValues.get(height).add(current.val); 
        } else {
            storedValues.get(height).add(0, current.val); 
        }
        
        
        helper(height+1,current.left);
        helper(height+1,current.right);
    }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        helper(0,root);
        return storedValues;
    }
}
