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
    private List<String> result = new ArrayList<>();
    
    private void helper(String str,TreeNode current){
        if(current==null) return;
        
        if(current.left==null && current.right==null){
            result.add(str);
            return;
        }
        
        if(current.left!=null){
            String copyStr=new String(str);
            copyStr+="->";
            copyStr+=current.left.val;
            helper(copyStr,current.left);
        }
        
        if(current.right!=null){
            str+="->";
            str+=current.right.val;
            helper(str,current.right);
        }
           
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return result;
        
        helper(Integer.toString(root.val), root);
        
        return result;
    }
}