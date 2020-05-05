package problem_0034;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {5, 7, 7, 8, 8, 10};
        int result[] = solution.searchRange(nums, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
