package problem_0209;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    sum += nums[i];
                } else {
                    sum += nums[j];
                }
                if (sum < s) {
                    continue;
                } else if (sum >= s && min > i - j + 1) {
                    min = i - j + 1;
                    break;
                }
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
