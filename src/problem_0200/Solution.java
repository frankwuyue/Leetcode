package problem_0200;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid.length, grid[i].length, grid);
                    sum++;
                }
            }
        }
        return sum;
    }

    private void dfs(int i, int j, int boundx, int bounty, char[][] grid) {
        // Check for invalid indices and for sites that aren't land
//        if (i < 0 || i >= boundx || j < 0 || j >= bounty || grid[i][j] != '1') return;

        // Mark the site as visited
//        grid[i][j] = '0';

        // Check all adjacent sites
//        dfs(i + 1, j, boundx, bounty, grid);
//        dfs(i - 1, j, boundx, bounty, grid);
//        dfs(i, j + 1, boundx, bounty, grid);
//        dfs(i, j - 1, boundx, bounty, grid);
        grid[i][j] = '0';
        int k[][] = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (int l = 0; l < 4; l++) {
            int ichange = i + k[l][0];
            int jchange = j + k[l][1];
            if (
                    ichange >= 0 && ichange < boundx && jchange >= 0 && jchange < bounty && grid[ichange][jchange] == '1'
            ) {

                dfs(ichange, jchange, boundx, bounty, grid);
            }
        }
        return;
    }
}