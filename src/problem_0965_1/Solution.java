package problem_0965_1;

class Solution {
    boolean is = true;

    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        isUnival(root, value);
        return is;
    }

    private void isUnival(TreeNode node, int value) {
        if (node == null) {
            return;
        }
        if (node.val != value) {
            is = false;
            return;
        }
        isUnival(node.right, value);
        isUnival(node.left, value);
    }

}