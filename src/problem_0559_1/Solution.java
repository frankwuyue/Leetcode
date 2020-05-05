package problem_0559_1;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                for (Node k : node.children) {
                    queue.add(k);
                }
            }
            depth++;
        }
        return depth;
    }


}