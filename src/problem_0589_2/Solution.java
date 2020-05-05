package problem_0589_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node first = stack.pop();
            list.add(first.val);
            for (int i = first.children.size() - 1; i >= 0; i--) {
                stack.push(first.children.get(i));
            }
        }
        return list;
    }

}