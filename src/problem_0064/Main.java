package problem_0064;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] obstacleGrid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};

        System.out.println(solution.minPathSum(obstacleGrid));
    }
}
