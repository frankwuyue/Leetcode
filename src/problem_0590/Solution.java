package problem_0590;

import java.util.LinkedList;
import java.util.List;

class Solution {
    List<Integer> list = new LinkedList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new LinkedList<>();
        }
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
        list.add(root.val);
        return list;
    }

}