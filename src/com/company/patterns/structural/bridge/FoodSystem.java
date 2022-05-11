package com.company.patterns.structural.bridge;

public class FoodSystem extends Program {

    public FoodSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Developing Food System program");
        developer.writeCode();
    }
}
