package problem_0872;

import java.util.LinkedList;
import java.util.List;

class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }


    private void dfs(TreeNode root, List<Integer> list) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        if (root.left != null) {
            dfs(root.left, list);
        }
        if (root.right != null) {
            dfs(root.right, list);
        }
    }

}