package com.company.patterns.creational.factory;

public class FactoryStarter {
    public static void main(String[] args) {
        Factory factory = returnFactoryByName("java");
        Developer developer = factory.createDeveloper();
        developer.writeCode();

    }

    public static Factory returnFactoryByName(String name) {
        if (name.equals("java")) {
            return new JavaDeveloperFactory();
        } else if (name.equals("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(name + " isn't present");
        }
    }

}
