package problem_0226_2;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return null;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            TreeNode left = node.left;
            TreeNode right = node.right;
            node.right = left;
            node.left = right;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }

}