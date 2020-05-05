package problem_0019;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        while (head != null) {
            length++;
            head = head.next;
        }

        ListNode cur = dummyHead;
        for (int i = 0; i < length - n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummyHead.next;
    }
}