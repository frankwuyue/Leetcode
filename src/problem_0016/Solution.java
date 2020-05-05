package problem_0016;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private static final int INT_MAX = Integer.MAX_VALUE;

    public int threeSumClosest(int[] nums, int target) {
        int nearestGap = INT_MAX;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                map.put(j, target - (nums[i] + nums[j]));
                if (j > i + 1) {
                    int k;
                    if (nums[j] <= map.get(j - 1)) {
                        k = map.get(j - 1) - nums[j];
                    } else {
                        k = findNearestGap(map, nums[j]);
                    }
                    nearestGap = Math.abs(nearestGap) > Math.abs(k) ? k : nearestGap;
                    if (nearestGap == 0) {
                        return target;
                    }
                }
            }
        }
        return target - nearestGap;
    }

    private int findNearestGap(Map<Integer, Integer> map, int target) {
        int k = INT_MAX;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            k = Math.abs(entry.getValue() - target) > Math.abs(k) ? k : entry.getValue() - target;
            if (k == 0) {
                return k;
            }
        }
        return k;
    }
}


