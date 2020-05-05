package problem_0118_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0) {
            return lists;
        }

        lists.add(0, Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            subList.add(0, 1);
            for (int j = 0; j < lists.get(i - 1).size() - 1; j++) {
                subList.add(lists.get(i - 1).get(j) + lists.get(i - 1).get(j + 1));
            }
            subList.add(1);
            lists.add(subList);
        }
        return lists;
    }
}
