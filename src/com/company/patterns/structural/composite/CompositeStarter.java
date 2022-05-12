package com.company.patterns.structural.composite;

public class CompositeStarter {
    public static void main(String[] args) {
        Team team = new Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new CppDeveloper());

        team.writeCode();
    }
}
