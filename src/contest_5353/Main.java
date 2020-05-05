package contest_5353;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] integers1 = new int[]{2, 1, 3, 5, 4};
        int[] integers2 = new int[]{3, 2, 4, 1, 5};
        int[] integers3 = new int[]{4, 1, 2, 3};
        int[] integers4 = new int[]{2, 1, 4, 3, 6, 5};
        int[] integers5 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(solution.numTimesAllBlue(integers1));
        System.out.println(solution.numTimesAllBlue(integers2));
        System.out.println(solution.numTimesAllBlue(integers3));
        System.out.println(solution.numTimesAllBlue(integers4));
        System.out.println(solution.numTimesAllBlue(integers5));
    }
}
