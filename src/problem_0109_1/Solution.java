package problem_0109_1;

class Solution {
    ListNode h;

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        h = head;
        int size = calcSize(head);
        TreeNode root = add(0, size - 1);
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

    private TreeNode add(int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;

        TreeNode left = add(l, mid - 1);
        TreeNode node = new TreeNode(h.val);
        h = h.next;
        node.left = left;
        node.right = add(mid + 1, r);
        return node;
    }
}