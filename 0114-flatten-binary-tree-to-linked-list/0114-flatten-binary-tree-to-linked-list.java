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
    private List<TreeNode> linkedListOrder = new ArrayList<TreeNode>();
    
    private void helper(TreeNode current) {
        if (current == null) return;
        
        linkedListOrder.add(current);
        
        helper(current.left);
        helper(current.right);
    }
    
    public void flatten(TreeNode root) {
        helper(root);
        
        for (int i = 0; i < linkedListOrder.size() - 1; i++) {
            linkedListOrder.get(i).left = null;
            linkedListOrder.get(i).right = linkedListOrder.get(i + 1);
        }
        
        if (!linkedListOrder.isEmpty()) {
            linkedListOrder.get(linkedListOrder.size() - 1).left = null;
            linkedListOrder.get(linkedListOrder.size() - 1).right = null;
        }
    }
}