package problem_0106;

import java.util.HashMap;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode buildTreeHelper(int[] inorder, int il, int ir, int[] postorder, int pl, int pr, HashMap<Integer, Integer> map) {
        if (il > ir || pl > pr) {
            return null;
        }
        int rootNum = postorder[pr];
        TreeNode root = new TreeNode(postorder[pr]);
        int indexOfInOrder = map.get(rootNum);
        root.left = buildTreeHelper(inorder, il, indexOfInOrder - 1, postorder, pl, pl + indexOfInOrder - il - 1, map);
        root.right = buildTreeHelper(inorder, indexOfInOrder + 1, ir, postorder, pl + indexOfInOrder - il, pr - 1, map);
        return root;
    }
}