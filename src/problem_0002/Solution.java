package problem_0002;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jinwei = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (l1 != null || l2 != null) {
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;
            int sum = l1Val + l2Val + jinwei;
            jinwei = 0;
            if (sum >= 10) {
                jinwei = 1;
            }
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = node;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if (jinwei > 0) {
            curr.next = new ListNode(jinwei);
        }
        return dummyHead.next;
    }
}