package com.company.inputoutput;

import java.io.*;

import static com.company.inputoutput.Common.convertBytesToCharArray;
import static com.company.inputoutput.Common.path;

public class BufferedSteamEx {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + "bufferedFile.txt"));
        bos.write("hello igor what's up?".getBytes());
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path + "bufferedFile.txt"));
        byte[] bytes = new byte[bis.available()];
        bis.read(bytes);

        System.out.println(convertBytesToCharArray(bytes));
        bis.close();


    }
}
