package problem_0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>();
        if (rowIndex == 0) {
            return Arrays.asList(1);
        }

        lists.add(0, Arrays.asList(1));

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> subList = new ArrayList<>();
            subList.add(0, 1);
            for (int j = 0; j < lists.get(1 - i % 2).size() - 1; j++) {
                subList.add(lists.get(1 - i % 2).get(j) + lists.get(1 - i % 2).get(j + 1));
            }
            subList.add(1);
            lists.add(i % 2, subList);
        }
        return lists.get(rowIndex % 2);
    }
}
