package problem_0054;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();


        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] matrixBeen = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixBeen[i][j] = false;
            }
        }

        int[] xVector = new int[]{1, 0, -1, 0};
        int[] yVector = new int[]{0, -1, 0, 1};

        int i = 0;
        int j = 0;
        int vector = 0;

        while (true) {
            if (matrixBeen[i][j] == false) {
                matrixBeen[i][j] = true;
                result.add(matrix[i][j]);
            }

            if (result.size() == m * n) {
                break;
            }
            i = i + yVector[vector];
            j = j + xVector[vector];
            while (i >= m || j >= n || i < 0 || j < 0 || matrixBeen[i][j] == true) {
                i = i - yVector[vector];
                j = j - xVector[vector];
                vector = (vector + 1) % 4;
                i = i + yVector[vector];
                j = j + xVector[vector];
            }
        }
        return result;
    }
}
