package problem_0031;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    private void swap(int[] nums, int i, int k) {
        int swap = nums[k];
        nums[k] = nums[i];
        nums[i] = swap;
    }

    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            // 从数组末尾数起，寻找第一个递减的数
            if (nums[i - 1] < nums[i]) {
                // 第一个递减的数到数组末尾之间，寻找比第一个递减的数稍大一点的数
                for (int k = nums.length - 1; k >= i; k--) {
                    // 把这个稍大的数和第一个递减的数交换位置
                    if (nums[k] > nums[i - 1]) {
                        swap(nums, i - 1, k);
                        break;
                    }
                }
                // 这个稍大的数到数组末尾之间，讲数组单调增加再次排序
                Arrays.sort(nums, i, nums.length);
                break;
            } else if (i == 1) {
                Arrays.sort(nums);
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + ", ");
//        }

    }

}
