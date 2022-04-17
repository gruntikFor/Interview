package com.company.inputoutput;

import java.io.*;

import static com.company.inputoutput.Common.path;

public class DataIOEx {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(path + "data.bin"));
        dos.writeInt(22);
        dos.writeDouble(15.2);
        dos.writeBoolean(true);
        dos.writeUTF("igrik");

        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream(path + "data.bin"));
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
    }
}
