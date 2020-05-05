package problem_0082;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {1, 1, 1, 2, 3};
        ListNode l1 = new ListNode(array1);
        ListNode sum = solution.deleteDuplicates(l1);
        System.out.println(sum);
    }
}
