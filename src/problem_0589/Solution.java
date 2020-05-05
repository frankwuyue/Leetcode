package problem_0589;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<Integer> list = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return new LinkedList<>();
        }
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
        return list;
    }

}