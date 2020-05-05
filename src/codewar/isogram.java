package codewar;

import java.util.*;

public class isogram {
    public static boolean isIsogram(String str) {
//        if (str == null || str.length() == 0) {
//            return true;
//        }
//        int length = str.length();
//        List<Character> list = new ArrayList<>();
//        for (int i = 0; i < length; i++) {
//            list.add(Character.toLowerCase(str.charAt(i)));
//        }
//        long lengthAfter = list.stream().distinct().count();
//        if (length != lengthAfter) {
//            return false;
//        }
//        return true;
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
