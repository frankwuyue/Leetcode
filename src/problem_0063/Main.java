package problem_0063;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        System.out.println(solution.uniquePathsWithObstacles(obstacleGrid));
    }
}
