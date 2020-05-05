package problem_0020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> parenthesesMap = new HashMap<Character, Character>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        for (int i = 0; i < s.length(); i++) {
            if (parenthesesMap.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char k = stack.pop();
                if (parenthesesMap.get(k) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
