package problem_0057;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int index = binarySearch(intervals, newInterval);
        int[][] mergedArray = addPos(intervals, newInterval, index);
//        System.out.println(index);
        return merge(mergedArray);
    }

    private int[][] merge(int[][] intervals) {
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

    private int binarySearch(int[][] intervals, int[] newInterval) {
        int left = 0;
        int right = intervals.length - 1;
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (intervals[pivot][0] == newInterval[0]) {
                return pivot;
            } else if (intervals[pivot][0] < newInterval[0]) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return left;
    }

    private int[][] addPos(int[][] intervals, int[] newInterval, int index) {
        int[][] result = new int[intervals.length + 1][];
        for (int i = 0; i < index; i++) {
            result[i] = intervals[i];
        }

        result[index] = newInterval;
        for (int i = index; i < intervals.length; i++) {
            result[i + 1] = intervals[i];
        }

        return result;
    }
}
