/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    private List<List<Node>> storedValues = new ArrayList<>();
        
    private void helper(int height,Node current) {
        if(current==null){
            return;
        }
        
        while (storedValues.size() <= height) {
            storedValues.add(new ArrayList<>());
        }   
        
        storedValues.get(height).add(current);
        
        helper(height+1,current.left);
        helper(height+1,current.right);
    }
    
    public Node connect(Node root) {
        if(root==null) return null;
        
        root.next=null;
        helper(0,root);
        
        for(int i=0;i<storedValues.size();i++){
            for(int j=0;j<storedValues.get(i).size()-1;j++){
                storedValues.get(i).get(j).next=storedValues.get(i).get(j+1);
            }
            storedValues.get(i).get(storedValues.get(i).size()-1).next=null;
        }
        
        return root;
        
    }
}