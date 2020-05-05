package problem_0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> leastSum = new ArrayList<>();
        leastSum.add(Arrays.asList(triangle.get(0).get(0)));

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> each = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    each.add(leastSum.get(i - 1).get(0) + triangle.get(i).get(0));
                } else if (j == triangle.get(i).size() - 1) {
                    each.add(leastSum.get(i - 1).get(leastSum.get(i - 1).size() - 1) + triangle.get(i).get(triangle.get(i).size() - 1));
                } else {
                    each.add(Math.min(leastSum.get(i - 1).get(j - 1), leastSum.get(i - 1).get(j)) + triangle.get(i).get(j));
                }
            }
            leastSum.add(each);
        }
        Collections.sort(leastSum.get(leastSum.size() - 1));
        return leastSum.get(leastSum.size() - 1).get(0);
    }
}


