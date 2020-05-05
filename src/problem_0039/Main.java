package problem_0039;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {2, 3, 6, 7};
        List<List<Integer>> result = solution.combinationSum(nums, 7);
        System.out.println(result);
    }
}
