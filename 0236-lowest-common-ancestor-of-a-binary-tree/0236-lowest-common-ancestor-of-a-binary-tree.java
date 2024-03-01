class Solution {
    private TreeNode answer;

    public boolean findPath(TreeNode current, TreeNode target, List<Integer> path) {
        if (current == null)
            return false;

        path.add(current.val);

        if (current == target)
            return true;

        if (findPath(current.left, target, path) || findPath(current.right, target, path))
            return true;

        path.remove(path.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();

        if (!findPath(root, p, pList) || !findPath(root, q, qList))
            return null;

        int i = 0;
        while (i < pList.size() && i < qList.size()) {
            if (!pList.get(i).equals(qList.get(i)))
                break;
            i++;
        }

        return new TreeNode(pList.get(i - 1)); 
    }
}