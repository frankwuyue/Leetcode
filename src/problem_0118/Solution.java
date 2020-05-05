package problem_0118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        generateTriangle(numRows);
        return lists;
    }

    private void generateTriangle(int numRows) {
        if (numRows == 1) {
            lists.add(0, Arrays.asList(1));
            return;
        }
        generate(numRows - 1);
        List<Integer> subList = new ArrayList<>();
        subList.add(1);
        for (int i = 0; i < lists.get(numRows - 2).size() - 1; i++) {
            subList.add(lists.get(numRows - 2).get(i) + lists.get(numRows - 2).get(i + 1));
        }
        subList.add(lists.get(numRows - 2).size(), 1);
        lists.add(subList);
    }
}
