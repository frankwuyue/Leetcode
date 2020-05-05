package problem_0059;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int[][] a = new int[n][n];
        a = solution.generateMatrix(1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
    }
}
