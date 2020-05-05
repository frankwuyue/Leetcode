package problem_0033;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    //    public int search(int[] nums, int target) {
//        List<Integer> numsArray = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        return numsArray.indexOf(target);
//    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int fromIndex, int toIndex, int target) {
        int mid = fromIndex + (toIndex - fromIndex) / 2;
        if (fromIndex > toIndex) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        }
        // left > mid < right: right half sorted
        if (nums[mid] < nums[toIndex]) {
            if (target > nums[mid] && target <= nums[toIndex]) {
                return binarySearch(nums, mid + 1, toIndex, target);
            } else {
                return binarySearch(nums, fromIndex, mid - 1, target);
            }
        } else {
            // left < mid > right: left half sorted
            if (target >= nums[fromIndex] && target < nums[mid]) {
                return binarySearch(nums, fromIndex, mid - 1, target);
            } else {
                return binarySearch(nums, mid + 1, toIndex, target);
            }
        }
    }
}
