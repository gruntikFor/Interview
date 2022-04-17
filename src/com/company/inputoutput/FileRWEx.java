package com.company.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import static com.company.inputoutput.Common.path;

public class FileRWEx {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(path + "fileWriter.txt", false);
        fw.write("string number 1");
        fw.append("\n");
        fw.append("new str 2");
        fw.close();

        FileReader fr = new FileReader(path + "fileWriter.txt");
        FileReader fr1 = new FileReader(path + "fileWriter.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.println();

        char[] chars = new char[50];
        int ch2;
        while ((ch2 = fr1.read(chars)) > 0) {
            chars = Arrays.copyOf(chars, ch2);
            System.out.print(chars);
        }

        fr1.close();

    }
}
