package problem_0015;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answerList = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> numsArray = Arrays.stream(nums).boxed().collect(Collectors.toList());
            numsArray.remove(i);
            List<List<Integer>> answer = twoSum(numsArray, 0 - nums[i]);
            if (answer.size() != 0) {
                if (!answerList.contains(answer)) {
                    answerList.addAll(answer);
                }
            }
        }

        return answerList.stream().distinct().collect(Collectors.toList());
    }


    public List<List<Integer>> twoSum(List<Integer> nums, int target) {
        List<List<Integer>> answerList = new ArrayList<List<Integer>>();

        if (nums.size() == 0) {
            return answerList;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            List<Integer> answer = new ArrayList<Integer>();
            if (map.containsKey(target - nums.get(i))) {
                answer.add(0, target - nums.get(i));
                answer.add(1, nums.get(i));
                answer.add(2, 0 - target);
                Collections.sort(answer);
                answerList.add(answer);
            } else {
                map.put(nums.get(i), i);
            }
        }
        return answerList;
    }
}
