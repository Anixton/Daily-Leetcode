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
    private int result=0;
    private void checkPalindromePossibility(Map<Integer,Integer> counter){
        int oddCount=0;
        for(Map.Entry<Integer,Integer> kvp : counter.entrySet()){
            if(kvp.getValue()%2==1){
                oddCount++;
            }
            if(oddCount>1){break;}
        }
        result += (oddCount <= 1) ? 1 : 0;
    }
        
    
    public void helper(TreeNode current,Map<Integer,Integer> counter)
    {
        Map<Integer, Integer> counterCopy = new HashMap<>(counter);
        if(current!=null){
            if(counterCopy.containsKey(current.val)){
                counterCopy.put(current.val, counterCopy.get(current.val) + 1);
            }
            else{
                counterCopy.put(current.val, 1);
            }
            
            if (current.left == null && current.right == null) {
                checkPalindromePossibility(counterCopy);
                return;
            }
            else{
                helper(current.left,counterCopy);
                helper(current.right,counterCopy);
            }
        }
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        Map<Integer,Integer> dictionary = new HashMap<>();
        helper(root,dictionary);
        return result;
    }
}




