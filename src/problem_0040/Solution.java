package problem_0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {

    List<List<Integer>> resultList = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // sort candidates
        Arrays.sort(candidates);

        dfs(target, candidates, 0, new Stack<Integer>());
//        List<List<Integer>> result = resultList.stream().distinct().collect(Collectors.toList());
        return resultList;
    }

    private void dfs(int target, int[] candidates, int beginIndex, Stack<Integer> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            resultList.add(new ArrayList<>(result));
            return;
        }

        for (int i = beginIndex; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            if (target >= candidates[i]) {
                if (i > beginIndex && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                result.push(candidates[i]);
                dfs(target - candidates[i], candidates, i + 1, result);
                result.pop();
            }
        }
    }
}
