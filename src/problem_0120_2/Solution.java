package problem_0120_2;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int[] leastSum = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> rows = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                leastSum[j] = Math.min(leastSum[j], leastSum[j + 1]) + rows.get(j);
            }
        }
        return leastSum[0];
    }
}


