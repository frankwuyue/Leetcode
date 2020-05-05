package problem_0617;

import java.util.Stack;

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(t1);
        stack2.push(t2);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            TreeNode n1 = stack1.pop();
            TreeNode n2 = stack2.pop();
            if (n1 == null || n2 == null) {
                continue;
            }
            n1.val += n2.val;
            if (n1.right != null) {
                stack1.push(n1.right);
                stack2.push(n2.right);
            } else {
                n1.right = n2.right;
            }

            if (n1.left != null) {
                stack1.push(n1.left);
                stack2.push(n2.left);
            } else {
                n1.left = n2.left;
            }

        }
        return t1;

    }

}