package problem_0048;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.rotate(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
