/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    private List<Integer> valuesInPostOrder = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        helper(root);
        return valuesInPostOrder;
    }

    private void helper(Node root) {
        if(root == null) return;

        for(Node node : root.children) {
            helper(node);
        }

        valuesInPostOrder.add(root.val);
    }
}