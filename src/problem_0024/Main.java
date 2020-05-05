package problem_0024;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {1, 2, 3};
        ListNode l1 = new ListNode(array1);
        ListNode sum = solution.swapPairs(l1);
        System.out.println(sum);
    }
}
