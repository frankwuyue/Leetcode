package contest_5354;

import java.io.Serializable;
import java.util.*;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> managerMap = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] == -1) {
                continue;
            }
            if (!managerMap.containsKey(manager[i])) {
                managerMap.put(manager[i], new ArrayList<>());
            }
            managerMap.get(manager[i]).add(i);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(headID, 0));
        int time = 0;
        while (queue.size() > 0) {
            Node integerNode = queue.remove();
            time = Math.max(time, integerNode.time);
            if (informTime[integerNode.node] != 0) {
                List<Integer> children = managerMap.get(integerNode.node);
                for (int i = 0; i < children.size(); i++) {
                    queue.add(new Node(children.get(i), integerNode.time + informTime[integerNode.node]));
                }
            }
        }

        return time;
    }


    public class Node {
        int node;
        int time;

        Node(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
}


