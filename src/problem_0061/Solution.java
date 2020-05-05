package problem_0061;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode cur = dummyNode.next;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        if (length == 0) {
            return null;
        }
        int kMod = k % length;
        if (kMod > 0) {
            cur = dummyNode.next;
            for (int i = 0; i < length - kMod - 1; i++) {
                cur = cur.next;
            }
            ListNode cur2 = cur.next;
            dummyNode.next = cur.next;
            cur.next = null;
            for (int i = length - kMod; i < length - 1; i++) {
                cur2 = cur2.next;
            }
            cur2.next = head;
        }

        return dummyNode.next;
    }
}