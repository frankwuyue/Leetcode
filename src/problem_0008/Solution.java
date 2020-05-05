package problem_0008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static final int INT_MIN = -2147483648;
    public static final int INT_MAX = 2147483647;
    public static final int ZERO = 0;
    public static final char SPACE = ' ';
    public static final List<Character> NUMBERS =
            Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

    public int myAtoi(String str) {
        String afterTrim = str.trim();
        String numResult = "";
        String operator = "";
        boolean hasNum = false;
        for (int i = 0; i < afterTrim.length(); i++) {
            char now = afterTrim.charAt(i);
            if (SPACE == now) {
                break;
            }
            if (NUMBERS.contains(now)) {
                numResult += now;
                hasNum = true;
                continue;
            }
            if ((now == '-' || now == '+') && operator.length() == 0 && !hasNum) {
                operator += now;
                continue;
            }
            break;
        }

        if (numResult.length() != 0 && numResult.charAt(0) == '0') {
            int j = numResult.length() - 1;
            for (int i = 1; i < numResult.length(); i++) {
                if (numResult.charAt(i) != '0') {
                    j = i;
                    break;
                }
            }
            numResult = numResult.substring(j);
        }

        if (numResult.length() == 0) {
            return ZERO;
        } else if ((numResult.length() > String.valueOf(INT_MAX).length()) || (Double.valueOf(numResult).compareTo(Double.valueOf(INT_MAX)) > 0)) {
            if ("-".equals(operator)) {
                return INT_MIN;
            } else {
                return INT_MAX;
            }
        } else {
            return Integer.valueOf(operator + numResult);
        }
    }
}