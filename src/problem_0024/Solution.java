package problem_0024;

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur.next != null) {
            if (cur.next.next == null) {
                break;
            }
            // 1
            ListNode curcur = cur.next;
            // 2
            ListNode curcurcur = cur.next.next;
            // 1 -> 3
            cur.next.next = (cur.next.next.next == null) ? null : cur.next.next.next;
            // 0 -> 2
            cur.next = curcurcur;
            // 2 ->1
            curcurcur.next = curcur;
            if (cur.next.next == null) {
                break;
            } else {
                cur = cur.next.next;
            }
        }
        return dummyHead.next;
    }
}