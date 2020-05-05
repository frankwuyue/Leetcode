package problem_0804;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                stringBuilder.append(morse[word.charAt(i) - 'a']);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
