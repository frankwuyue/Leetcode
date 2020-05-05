package contest_5354;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] manager = new int[]{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        int[] informTime = new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(solution.numOfMinutes(15, 0, manager, informTime));
    }
}
