package problem_0108;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = add(nums, 0, nums.length - 1);
        return root;
    }

    private TreeNode add(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = add(nums, l, mid - 1);
        node.right = add(nums, mid + 1, r);
        return node;
    }
}