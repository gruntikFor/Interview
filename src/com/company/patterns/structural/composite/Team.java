package com.company.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void deleteDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("------Write Project------");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
