package com.zwk.lisp.impl;

import java.util.Arrays;

public class PrettyString {
    private static final char SPACE = 32;

    public static String removeExtraSpace(CharSequence sequence) {
        if (sequence == null) {
            return null;
        }
        int length = sequence.length();
        if (length == 0) {
            return "";
        }
        int spaceCount = 0;
        int i = 0;
        while (sequence.charAt(i) <= SPACE) {
            i++;
            if (i >= length) {
                return "";
            }
        }
        length = length - 1;
        while (sequence.charAt(length) <= SPACE) {
            length--;
        }
        int newLength = length - i + 1;
        char[] chars = new char[newLength];
        int index = 0;
        for (; i <= length; i++) {
            char c = sequence.charAt(i);
            if (c > SPACE) {
                chars[index++] = c;
                spaceCount = 0;
            }
            if (c <= SPACE && spaceCount == 0) {
                chars[index++] = SPACE;
                spaceCount++;
            }
        }
        if (!(newLength == index)) {
            chars = Arrays.copyOf(chars, index);
        }
        return new String(chars);
    }
}
