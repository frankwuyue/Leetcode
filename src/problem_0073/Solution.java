package problem_0073;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] mm = new int[m];
        int[] nn = new int[n];

        int mmm = 0;
        int nnn = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (!arrayContains(mm, i)) {
                        mm[mmm] = i;
                        mmm++;
                    }
                    if (!arrayContains(nn, j)) {
                        nn[nnn] = j;
                        nnn++;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrayContains(mm, i) || arrayContains(nn, j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private boolean arrayContains(int[] array, Integer value) {
        return Arrays.stream(array).anyMatch(value::equals);
    }
}
