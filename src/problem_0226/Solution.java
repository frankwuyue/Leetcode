package problem_0226;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        postOrder(root);
        return root;
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
    }
}