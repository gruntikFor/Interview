package com.company.patterns.creational.factory;

public class JavaDeveloperFactory implements Factory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
