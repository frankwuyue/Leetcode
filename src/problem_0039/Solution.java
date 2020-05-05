package problem_0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    List<List<Integer>> resultList = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // sort candidates
        Arrays.sort(candidates);

        dfs(target, candidates, 0, new Stack<Integer>());
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
            if (target >= candidates[i]) {
                result.push(candidates[i]);
                dfs(target - candidates[i], candidates, i, result);
                result.pop();
            }
        }
    }
}
