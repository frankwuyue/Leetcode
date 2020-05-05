package problem_0073;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        solution.setZeroes(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
