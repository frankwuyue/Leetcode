package problem_0056;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> mergedList = new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (mergedList.isEmpty() || mergedList.getLast()[1] < intervals[i][0]) {
                mergedList.add(intervals[i]);
            } else {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], intervals[i][1]);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
