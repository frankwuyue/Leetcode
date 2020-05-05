package problem_0938;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        inOrder(root, L, R);
        return sum;
    }

    private void inOrder(TreeNode node, int L, int R) {
        if (node == null) {
            return;
        }
        inOrder(node.left, L, R);
        if (node.val >= L && node.val < R) {
            sum += node.val;
        } else if (node.val == R) {
            sum += node.val;
            return;
        }
        inOrder(node.right, L, R);
    }
}