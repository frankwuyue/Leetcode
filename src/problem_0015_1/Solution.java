package problem_0015_1;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    List<List<Integer>> answerList = new ArrayList<List<Integer>>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return answerList;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, 0 - nums[i], i);
        }
        return answerList.stream().distinct().collect(Collectors.toList());
    }


    public void twoSum(int[] nums, int target, int targetIndex) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == targetIndex) {
                continue;
            }
            List<Integer> answer = new ArrayList<Integer>();
            if (map.containsKey(target - nums[i])) {
                answer.add(0, target - nums[i]);
                answer.add(1, nums[i]);
                answer.add(2, 0 - target);
                Collections.sort(answer);
                answerList.add(answer);
            } else {
                map.put(nums[i], i);
            }
        }
        return;
    }
}
