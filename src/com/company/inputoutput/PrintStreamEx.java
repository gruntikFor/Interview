package com.company.inputoutput;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static com.company.inputoutput.Common.path;

public class PrintStreamEx {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(path + "printStream.txt");
        PrintStream ps2 = new PrintStream(new FileOutputStream(path + "printStream2.txt"), true);

        ps.println("hello print stream");
        ps.println("hello print stream");
        ps.println("hello print stream");
        ps.println("hello print stream");
        ps.write("igor".getBytes(StandardCharsets.UTF_8));
        ps2.print("hello print stream");

        ps.close();
        ps2.close();

        PrintWriter pw = new PrintWriter(path + "printWriter.txt");
        pw.println("hello");
        pw.println("str 2");
        pw.println("str 3");
        pw.close();


    }
}
