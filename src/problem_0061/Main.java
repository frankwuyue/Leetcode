package problem_0061;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {0, 1, 2};
        ListNode l1 = new ListNode(array1);
        ListNode sum = solution.rotateRight(l1, 4);
        System.out.println(sum);
    }
}
