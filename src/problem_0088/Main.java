package problem_0088;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums1[] = {1, 1, 2, 2, 0, 0, 0, 0};
        int nums2[] = {3, 5, 0};
        solution.merge(nums1, 4, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
