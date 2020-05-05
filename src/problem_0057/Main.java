package problem_0057;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[][] = {{1, 3}, {6, 9}};
        int target[] = {2, 5};
        int result[][] = solution.insert(nums, target);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
