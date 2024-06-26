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
public class Solution {
    private List<TreeNode> orderedNodes = new ArrayList<>();
    
    private void helper(TreeNode current) {
        if(current == null) return;
        
        helper(current.left);
        orderedNodes.add(current);
        helper(current.right);
    }
    
    private TreeNode constructTree(int left, int right) {
        if (left > right) return null; 
        int middle = left + (right - left) / 2; 
        TreeNode node = orderedNodes.get(middle);

        node.left = constructTree(left, middle - 1); 
        node.right = constructTree(middle + 1, right); 
        return node; 
    }
    
    public TreeNode balanceBST(TreeNode root) {
        helper(root); 
        return constructTree(0, orderedNodes.size() - 1);
    }
}