/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public void takeLeaves(TreeNode current,List<int> leafList)
    {
        if(current==null){return;}
        else if(current.left==null && current.right==null)
        {
            leafList.Add(current.val);
        }
        else
        {
            takeLeaves(current.left,leafList);
            takeLeaves(current.right,leafList);
        }
    }
    public bool LeafSimilar(TreeNode root1, TreeNode root2) {
        List<int>firstLeafList=new List<int>();
        List<int>secondLeafList=new List<int>();
        takeLeaves(root1,firstLeafList);
        takeLeaves(root2,secondLeafList);
        bool areEqual = firstLeafList.SequenceEqual(secondLeafList);
        return areEqual;
    }
}