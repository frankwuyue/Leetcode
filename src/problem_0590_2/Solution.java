package problem_0590_2;

import java.util.*;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node first = stack.pop();
            list.add(first.val);
            for (int i = 0; i < first.children.size(); i++) {
                stack.push(first.children.get(i));
            }
        }
        Collections.reverse(list);
        return list;
    }

}