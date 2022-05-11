package com.company.patterns.structural.adapter;

public class AdapterStarter {
    public static void main(String[] args) {
        Database database = new AdapterJavaDatabase();

        database.read();
        database.insert();
        database.update();
        database.delete();
    }

}
