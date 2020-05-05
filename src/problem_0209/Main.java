package problem_0209;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int s = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(solution.minSubArrayLen(s, nums));
    }
}
