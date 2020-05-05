package problem_0059;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        int[] xVector = new int[]{1, 0, -1, 0};
        int[] yVector = new int[]{0, -1, 0, 1};

        int i = 0;
        int j = 0;
        int vector = 0;

        int maxNum = 1;

        while (true) {
            if (matrix[i][j] == 0) {
                matrix[i][j] = maxNum;
            }

            if (maxNum == n * n) {
                break;
            }
            i = i + yVector[vector];
            j = j + xVector[vector];
            while (i >= n || j >= n || i < 0 || j < 0 || matrix[i][j] != 0) {
                i = i - yVector[vector];
                j = j - xVector[vector];
                vector = (vector + 1) % 4;
                i = i + yVector[vector];
                j = j + xVector[vector];
            }
            maxNum++;
        }
        return matrix;
    }
}
