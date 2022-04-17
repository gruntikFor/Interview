package com.company.inputoutput;

import java.io.*;

import static com.company.inputoutput.Common.path;

public class BufferedRWEx {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path + "bufferedWriter.txt"));
        bw.write("igrik\nhello");
        bw.flush();

        BufferedReader br = new BufferedReader(new FileReader(path + "bufferedWriter.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader(path + "bufferedWriter.txt"));
        int ch;
        while ((ch = br.read()) != -1) {
            System.out.print((char) ch);
        }

        System.out.println();

        String str;
        while ((str = br1.readLine()) != null) {
            System.out.println(str);
        }

        BufferedReader brConsoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter brConsoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter brFileWriter = new BufferedWriter(new FileWriter(path + "outputConsole.txt"));

        String text;
        while (!(text = brConsoleReader.readLine()).equals("ESC")) {
            brConsoleWriter.write("text: " + text + "\n");
            brFileWriter.write("text: " + text + "\n");
            brConsoleWriter.flush();
            brFileWriter.flush();
        }

    }
}
