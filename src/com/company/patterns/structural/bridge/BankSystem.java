package com.company.patterns.structural.bridge;

public class BankSystem extends Program {

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Developing Bank System program");
        developer.writeCode();
    }
}
