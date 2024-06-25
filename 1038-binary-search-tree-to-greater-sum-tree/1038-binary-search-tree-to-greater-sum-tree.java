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
    private List<Integer> treeElements = new ArrayList<>();
    private int position = 0;
    
    private void helper(TreeNode root) {
        if(root == null) return;
        
        helper(root.left);
        treeElements.add(root.val);
        helper(root.right);
    }
    
    private void reConstruct(TreeNode current) {
        if(current == null) return;
        
        reConstruct(current.left);
        
        current.val = treeElements.get(position);
        position++;
        
        reConstruct(current.right);
    } 
    
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        
        for (int i = treeElements.size() - 2; i >= 0; i--) {
            treeElements.set(i, treeElements.get(i) + treeElements.get(i + 1));
        }
        
        reConstruct(root);
        return root;
    }
}