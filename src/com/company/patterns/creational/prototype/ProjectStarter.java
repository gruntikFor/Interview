package com.company.patterns.creational.prototype;

public class ProjectStarter {
    public static void main(String[] args) {
        Project project = new Project(1L, "FoodMather", "new MyHead");
        System.out.println(project);

        Project copyProject = (Project) project.copy();
        System.out.println(copyProject);

        System.out.println(project.equals(copyProject));

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project projectFromFactory = projectFactory.cloneProject();
        System.out.println(projectFromFactory);

    }
}
