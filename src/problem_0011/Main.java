package problem_0011;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int answer = solution.maxArea(input);
        System.out.println(answer);
    }
}
