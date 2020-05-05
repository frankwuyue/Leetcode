package problem_0637_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Double> sum = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        average(root, 0, sum, count);
        for (int i = 0; i < sum.size(); i++) {
            sum.set(i, sum.get(i) / count.get(i));
        }
        return sum;
    }

    private void average(TreeNode node, int depth, List<Double> sum, List<Integer> count) {
        if (node == null) {
            return;
        }
        if (depth >= sum.size()) {
            sum.add(node.val * 1.0);
            count.add(1);
        } else {
            sum.set(depth, sum.get(depth) + node.val);
            count.set(depth, count.get(depth) + 1);
        }
        average(node.left, depth + 1, sum, count);
        average(node.right, depth + 1, sum, count);
    }

}