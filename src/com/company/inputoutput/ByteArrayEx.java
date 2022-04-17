package com.company.inputoutput;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayEx {
    public static void main(String[] args) throws IOException {
        String path = "src\\com\\company\\inputoutput\\files\\";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("igro".getBytes(StandardCharsets.UTF_8));
        System.out.println(baos);

        FileOutputStream fos = new FileOutputStream(path + "fileForByteArray.txt");
        baos.writeTo(fos);
    }
}
