package problem_0002;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {1, 8};
        int[] array2 = {0};
        ListNode l1 = new ListNode(array1);
        ListNode l2 = new ListNode(array2);
        ListNode sum = solution.addTwoNumbers(l1, l2);
        System.out.println(sum);
    }
}
