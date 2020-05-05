package problem_0055;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    public boolean canJump(int[] nums) {
        boolean cango = false;
        if (nums.length == 1) {
            return true;
        }
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (k < i) {
                return false;
            }
            k = Math.max(k, nums[i] + i);
        }
        return (k - (nums.length - 1) >= 0);
    }

}
