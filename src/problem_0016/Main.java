package problem_0016;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = new int[]{0, 2, 1, -3};
        int answer = solution.threeSumClosest(input, 1);
        System.out.println(answer);
    }
}
