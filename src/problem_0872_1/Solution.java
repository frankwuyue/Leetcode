package problem_0872_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root1);
        stack2.push(root2);
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (dfs(stack1) != dfs(stack2)) {
                return false;
            }
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }


    private int dfs(Stack<TreeNode> stack) {
        while (true) {
            TreeNode node = stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right == null && node.left == null) {
                return node.val;
            }
        }

    }

}