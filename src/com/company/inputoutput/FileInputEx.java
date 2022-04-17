package com.company.inputoutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static com.company.inputoutput.Common.convertBytesToCharArray;
import static com.company.inputoutput.Common.path;

public class FileInputEx {
    public static void main(String[] args) throws IOException {
        try {
            OutputStream outputStream = new FileOutputStream(path + "file.txt");
            OutputStream outputStream2 = new FileOutputStream(path + "file2.txt", false);

            byte[] bytes = "igor".getBytes();
            outputStream.write(bytes[0]);
            outputStream2.write("igor2".getBytes(StandardCharsets.UTF_8));

            outputStream.close();
            outputStream2.close();

            InputStream is = new FileInputStream(path + "file2.txt");
            int ch;

            while ((ch = is.read()) != -1) {
                System.out.print((char) ch);
            }
            is.close();

            InputStream is2 = new FileInputStream(path + "file2.txt");
            byte[] bytes2 = new byte[is2.available()];

            if (is2.read(bytes2) != -1) {
//                System.out.println(Arrays.toString(bytes2));
            }

            char[] chars = convertBytesToCharArray(bytes2);
            System.out.println(Arrays.toString(chars));

            String str = new String(chars);
            System.out.println(str);

            OutputStream os2 = new FileOutputStream(path + "fileOut2.txt");
            os2.write(bytes2);
            os2.close();

            InputStream is3 = new FileInputStream(path + "planttext.txt");
            byte[] bytes3 = new byte[is3.available()];
            is3.read(bytes3, 10, 5);
            is3.close();

            System.out.println(convertBytesToCharArray(bytes3));

        } catch (Exception e) {
            e.printStackTrace();
        }

        InputStream isWithFinally = null;
        try {
            isWithFinally = new FileInputStream(path + "fileWithFinally.txt");
            byte[] bytes = new byte[isWithFinally.available()];
            if (isWithFinally.read(bytes) != -1) {
                System.out.println(convertBytesToCharArray(bytes));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (isWithFinally != null) {
                    System.out.println("close finally");
                    isWithFinally.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
