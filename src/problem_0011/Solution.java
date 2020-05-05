package problem_0011;

class Solution {
    public int maxArea(int[] height) {
        // search all array, find the biggest (index a2 - index a1) * smaller(a2, a1)
        int maxAreaNum = 0;
        int first = 0;
        int last = height.length -1;

        while (first < last) {
            maxAreaNum = Math.max(maxAreaNum, Math.min(height[first], height[last]) * (last - first));
            if (height[first] < height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return maxAreaNum;
    }

}