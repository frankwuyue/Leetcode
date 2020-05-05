package problem_0105;

import java.util.HashMap;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder == null || preorder == null || inorder.length != preorder.length) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1, map);
    }

    private TreeNode buildTreeHelper(int[] inorder, int il, int ir, int[] preorder, int pl, int pr, HashMap<Integer, Integer> map) {
        if (il > ir || pl > pr) {
            return null;
        }
        int rootNum = preorder[pl];
        TreeNode root = new TreeNode(rootNum);
        int indexOfInOrder = map.get(rootNum);
        root.left = buildTreeHelper(inorder, il, indexOfInOrder - 1, preorder, pl + 1, pl + indexOfInOrder - il, map);
        root.right = buildTreeHelper(inorder, indexOfInOrder + 1, ir, preorder, pl + indexOfInOrder - il + 1, pr, map);
        return root;
    }
}