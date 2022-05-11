package com.company.patterns.structural.bridge;

public class BridgeStarter {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new FoodSystem(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }

    }
}
