package problem_0109;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        int size = calcSize(head);
        int[] nums = listNodeToArray(head, size);
        TreeNode root = add(nums, 0, nums.length - 1);
        return root;
    }

    private int calcSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    private int[] listNodeToArray(ListNode head, int size) {
        int[] result = new int[size];
        int i = 0;
        while (head != null) {
            result[i] = head.val;
            head = head.next;
            i++;
        }
        return result;
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