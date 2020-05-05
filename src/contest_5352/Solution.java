package contest_5352;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static final List<Character> CHARACTERS =
            Arrays.asList('a', 'b');

    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                sb.append(CHARACTERS.get(0));
            }
            return sb.toString();
        } else {
            for (int i = 0; i < n - 1; i++) {
                sb.append(CHARACTERS.get(0));
            }
            sb.append(CHARACTERS.get(1));
            return sb.toString();
        }
    }
}


