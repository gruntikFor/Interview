package com.company.patterns.creational.factory;

public class PhpDeveloperFactory implements Factory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
