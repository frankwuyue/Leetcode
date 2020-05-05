package problem_0559;

class Solution {
    int max = 0;

    public int maxDepth(Node root) {
        if (root == null) {
            return max;
        }
        getMaxDepth(root, 1);
        return max;
    }

    private void getMaxDepth(Node root, int depth) {
        if (root.children.isEmpty()) {
            if (max < depth) {
                max = depth;
            }
            return;
        }
        for (Node node : root.children) {
            getMaxDepth(node, depth + 1);
        }
    }


}