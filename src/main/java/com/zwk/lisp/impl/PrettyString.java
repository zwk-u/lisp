package com.zwk.lisp.impl;

public class PrettyString {
    private static final char SPACE = 32;

    public static String removeExtraSpace(CharSequence sequence) {
        if (sequence == null) {
            throw new NullPointerException("pretty string cannot be null!");
        }
        int length = sequence.length();
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = 0;
        while (sequence.charAt(i) == SPACE) {
            i++;
            if (i >= length) {
                return "";
            }
        }
        length = length - 1;
        while (sequence.charAt(length) == SPACE) {
            length--;
        }
        for (; i <= length; i++) {
            char c = sequence.charAt(i);
            if (c != SPACE) {
                sb.append(c);
                count = 0;
            }
            if (c == SPACE && count == 0) {
                sb.append(SPACE);
                count++;
            }
        }
        return sb.toString();
    }
}
