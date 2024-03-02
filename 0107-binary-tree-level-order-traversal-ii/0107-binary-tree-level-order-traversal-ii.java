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
    private List<List<Integer>> groupBy = new ArrayList<>();
    
    private void helper(int height,TreeNode current) {
        if(current==null) return;
        
        while(groupBy.size()<height+1){
            List<Integer> newLine = new ArrayList<>();
            groupBy.add(newLine);
        }
        
        groupBy.get(height).add(current.val);
        
        helper(height+1,current.left);
        helper(height+1,current.right);
    }    
        
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        helper(0,root);
        
        int leftPointer=0;
        int rightPointer=groupBy.size()-1;
        
        while(leftPointer<rightPointer) {
            Collections.swap(groupBy, leftPointer, rightPointer);
            
            leftPointer++;
            rightPointer--;
        }
        
        return groupBy;
    }
}