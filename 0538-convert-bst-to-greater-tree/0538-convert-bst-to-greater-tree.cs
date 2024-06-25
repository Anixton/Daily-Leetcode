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
    public void helper(TreeNode ptr,ref List<int> myList)
    {
        if(ptr==null)
        {
            return;
        }
        
        helper(ptr.left,ref myList);
        myList.Add(ptr.val);
        helper(ptr.right,ref myList);

    }
    public void changingValues(TreeNode current,ref List<int> myList,ref int position)
    {
        if(current==null)
        {
            return;
        }
        changingValues(current.left,ref myList,ref position);
        current.val=myList[position];
        position++;
        changingValues(current.right,ref myList,ref position);
    }
    public TreeNode ConvertBST(TreeNode root) {
        List<int> treeElements=new List<int>();
        helper(root,ref treeElements);
        for(int i=treeElements.Count-2;i>=0;i--)
        {
            treeElements[i]+=treeElements[i+1];
        }
        int pos=0;
        changingValues(root,ref treeElements,ref pos);
        return root;

    }
}