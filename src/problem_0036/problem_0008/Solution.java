package problem_0036.problem_0008;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public static final char DOT = '.';
    public static final List<Character> NUMBERS =
            Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

//    public boolean isValidSudoku(char[][] board) {
//
//    }
//
//    private boolean isValidInSquare(char[][] square) {
//
//    }

    private boolean isValidInLine(char[] line) {
        return Arrays.asList(line).stream().filter(l -> {
            return l.equals(DOT);
        }).allMatch(new HashSet<>()::add);
    }

}