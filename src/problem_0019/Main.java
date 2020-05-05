package problem_0019;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {1};
        ListNode l1 = new ListNode(array1);
        ListNode sum = solution.removeNthFromEnd(l1, 1);
        System.out.println(sum);
    }
}
