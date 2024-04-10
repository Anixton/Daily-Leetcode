/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private void helper(TreeNode upper,List<Integer> values,int left,int right){
        if(left>right) return;
        
        int middle = (left+right)/2;
        TreeNode current = new TreeNode(values.get(middle));
        if(values.get(middle)>upper.val){
            upper.right=current;
        } else{
            upper.left=current;
        }
        
        helper(current,values,left,middle-1);
        helper(current,values,middle+1,right);
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        
        List<Integer> values = new ArrayList<>();
        while(head!=null){
            values.add(head.val);
            head=head.next;
        }
        
        int middle = values.size()/2;
        TreeNode result = new TreeNode(values.get(middle));
        
        helper(result,values,0,middle-1);
        helper(result,values,middle+1,values.size()-1);
        
        return result;
    }
}