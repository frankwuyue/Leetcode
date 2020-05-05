package problem_0700_2;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

//    public TreeNode(int[] array) {
//        if (array == null || array.length == 0) {
//            throw new IllegalArgumentException("array cannot be empty");
//        }
//        this.val = array[0];
//        ListNode cur = this;
//        for (int i = 1; i < array.length; i++) {
//            cur.next = new ListNode(array[i]);
//            cur = cur.next;
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        ListNode cur = this;
//        while (cur != null) {
//            stringBuilder.append(cur.val + "->");
//            cur = cur.next;
//        }
//        stringBuilder.append("NULL");
//        return stringBuilder.toString();
//    }
}
