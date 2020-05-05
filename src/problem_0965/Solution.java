package problem_0965;

import java.util.Stack;

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != value) {
                return false;
            }
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return true;
    }

}