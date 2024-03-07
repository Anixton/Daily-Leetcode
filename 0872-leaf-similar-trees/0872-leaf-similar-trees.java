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
    private List<Integer> firstLeaves = new ArrayList<>();
    private List<Integer> secondLeaves = new ArrayList<>();
    
    private void helper(TreeNode current, boolean isFirst){
        if(current == null) return;
        if(current.left == null && current.right == null) {
            if(isFirst) {
               firstLeaves.add(current.val); 
            } else {
               secondLeaves.add(current.val);
            }
            return;
        }
        
        helper(current.left,isFirst);
        helper(current.right,isFirst);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1,true);
        helper(root2,false);
        
        if(firstLeaves.size() != secondLeaves.size()) return false;
        
        for(int i=0;i<firstLeaves.size();i++){
            if(!firstLeaves.get(i).equals(secondLeaves.get(i))) return false;
        }
        
        return true;
    }
}