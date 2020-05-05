package problem_0056;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int result[][] = solution.merge(nums);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
