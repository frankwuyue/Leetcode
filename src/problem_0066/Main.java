package problem_0066;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = new int[]{9, 9, 9};

        int[] result = solution.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
    }
}
