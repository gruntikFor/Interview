package com.company.patterns.structural.adapter;

public class AdapterJavaDatabase extends JavaBase implements Database {
    @Override
    public void read() {
        readObject();
    }

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
