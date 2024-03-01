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
    private List<Integer> valuesInOrder = new ArrayList<>();
    
    public void helper(TreeNode current) {
        if(current == null) return;
        
        helper(current.left);
        valuesInOrder.add(current.val);
        helper(current.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        return valuesInOrder.get(k-1);
    }
}