package problem_0026;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = i+1;j<nums.length;j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
