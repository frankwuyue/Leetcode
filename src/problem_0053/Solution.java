package problem_0053;

public class Solution {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int num : nums) {
            if (sum < 0) {
                sum = num;
            } else {
                sum += num;
            }
            max = (max < sum) ? sum : max;
        }
        return max;
    }
}
