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
    List<List<Integer>> treeValues = new ArrayList<>();
    
    private void helper(TreeNode current,int height){
        if (height >= treeValues.size()) {
            treeValues.add(new ArrayList<>());
        }
        treeValues.get(height).add(current.val);
        if (current.left != null) helper(current.left, height + 1);
        if (current.right != null) helper(current.right, height + 1);
    }
    
    public boolean isEvenOddTree(TreeNode root) {
        
        if(root.val%2==0) return false;
        
        helper(root,0);
        
        for (int i = 0; i < treeValues.size(); i++) {
            List<Integer> level = treeValues.get(i);
            if(level.size() == 1){
                if(i%2 == 0 && level.get(0)%2==0) return false;
                if(i%2 == 1 && level.get(0)%2==1) return false;
            }
            for (int j = 1; j < level.size(); j++) {
                int val = level.get(j);
                int prevVal = level.get(j - 1);
                        if(i%2 == 0 && prevVal%2==1 && val%2==1 && val>prevVal){
                            continue;
                        } else if(i%2==0) return false;
                        else if(i%2==1 && prevVal%2==0 && val%2==0 && val<prevVal){
                            continue;
                        } else if(i%2==1) return false;
                        else {
                            return false;
                        }
            }
        }
        
        return true;
    }
}