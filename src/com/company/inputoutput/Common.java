package com.company.inputoutput;

import java.util.Arrays;

public class Common {
    static String path = "src\\com\\company\\inputoutput\\files\\";

    public static char[] convertBytesToCharArray(byte[] arr) {
        char[] chars = new char[arr.length];
        int inx = 0;
        for (byte b : arr) {
            if (b != 0) {
                chars[inx++] = (char) b;
            }
        }

        return Arrays.copyOf(chars, inx);
    }
}
