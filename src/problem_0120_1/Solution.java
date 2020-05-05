package problem_0120_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int[] leastSum = new int[triangle.size()];
        leastSum[0] = triangle.get(0).get(0);

        int prev = 0, cur;
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> rows = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                cur = leastSum[j];
                if (j == 0) {
                    leastSum[j] = cur + rows.get(j);
                } else if (j == i) {
                    leastSum[j] = prev + rows.get(j);
                } else {
                    leastSum[j] = Math.min(cur, prev) + rows.get(j);
                }
                prev = cur;
            }
        }
        Arrays.sort(leastSum);
        return leastSum[0];
    }
}


