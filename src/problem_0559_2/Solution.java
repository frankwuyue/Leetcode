package problem_0559_2;

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            int value = maxDepth(node);
            if (value > max) {
                max = value;
            }
        }
        return max + 1;
    }

}