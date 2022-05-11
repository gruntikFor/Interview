package com.company.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        director.setWebsiteBuilder(new MicrosoftWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
