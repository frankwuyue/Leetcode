package problem_0066;

public class Solution {
    public int[] plusOne(int[] digits) {
        int plusOne = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + plusOne;
            if (sum > 9) {
                digits[i] = 0;
                if (i == 0) {
                    return newArray(digits.length);
                }
                plusOne = 1;
            } else {
                digits[i] = sum;
                plusOne = 0;
            }
        }
        return digits;
    }

    private int[] newArray(int length) {
        int[] array = new int[length + 1];
        array[0] = 1;
        for (int i = 1; i <= length; i++) {
            array[i] = 0;
        }
        return array;
    }
}
