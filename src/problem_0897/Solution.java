package problem_0897;

class Solution {
    TreeNode node = new TreeNode(0);
    TreeNode cur = node;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        increasingBSTprivate(root);
        return node.right;
    }

    private void increasingBSTprivate(TreeNode root) {
        if (root == null) {
            return;
        }
        increasingBST(root.left);
        root.left = null;
        cur.right = root;
        cur = cur.right;
        increasingBST(root.right);
    }
}