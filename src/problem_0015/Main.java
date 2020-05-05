package problem_0015;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> answer = solution.threeSum(input);
        System.out.println(answer);
    }
}
