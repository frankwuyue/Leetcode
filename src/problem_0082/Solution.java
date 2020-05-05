package problem_0082;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> duplicates = new LinkedHashMap<>();
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = head;
        while (cur != null) {
            if (duplicates.containsKey(cur.val)) {
                int count = duplicates.get(cur.val);
                duplicates.put(cur.val, count + 1);
            } else {
                duplicates.put(cur.val, 1);
            }
            cur = cur.next;
        }

        cur = dummyHead;
        while (cur.next != null) {
            if (duplicates.get(cur.next.val) > 1) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}