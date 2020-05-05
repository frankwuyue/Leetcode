package problem_0034;

import java.util.Arrays;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] results = {-1, -1};

        int findStartIndex = this.binarySearch(nums, 0, nums.length - 1, target, 0);
        if (findStartIndex == nums.length || nums[findStartIndex] != target) {
            return results;
        }
        results[0] = findStartIndex;
        results[1] = this.binarySearch(nums, 0, nums.length - 1, target, 1) - 1;

        return results;
    }

    private int binarySearch(int[] nums, int startIndex, int endIndex, int target, int mode) {
        int splitLength = (startIndex + endIndex) / 2;
        // compare the mid num and target
        if (startIndex > endIndex) return startIndex;
        if (mode == 0) {
            if (nums[splitLength] >= target) {
                return binarySearch(nums, startIndex, splitLength - 1, target, 0);
            } else {
                return binarySearch(nums, splitLength + 1, endIndex, target, 0);
            }
        } else {
            if (nums[splitLength] > target) {
                return binarySearch(nums, startIndex, splitLength - 1, target, 1);
            } else {
                return binarySearch(nums, splitLength + 1, endIndex, target, 1);
            }
        }
    }
}
